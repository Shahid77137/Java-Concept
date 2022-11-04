package com.onlinesales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.*;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

public class ExpressionEvaluator {
    private static final String API_ENDPOINT = "https://www.onlinesales.ai/retail-media-product";
    private static final int MAX_REQUESTS_PER_SECOND = 50;
    private static final int MAX_CONCURRENT_REQUESTS = 10;

    public static void main(String[] args) {
        List<String> expressions = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String input;
            while (!(input = reader.readLine()).equalsIgnoreCase("end")) {
                expressions.add(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Create a thread pool for concurrent expression evaluation
        ExecutorService executorService = Executors.newFixedThreadPool(MAX_CONCURRENT_REQUESTS);

        // Rate limiting: Ensure we don't exceed the API rate limit
        int requestsThisSecond = 0;
        long startTime = System.currentTimeMillis();
        Semaphore rateLimiter = new Semaphore(MAX_REQUESTS_PER_SECOND);

        HttpClient httpClient = HttpClients.createDefault();

        for (String expression : expressions) {
            long elapsedTime = System.currentTimeMillis() - startTime;
            if (elapsedTime >= 1000) {
                // Reset request count and timer
                requestsThisSecond = 0;
                startTime = System.currentTimeMillis();
            }

            if (requestsThisSecond >= MAX_REQUESTS_PER_SECOND) {
                // Sleep for a while if we've reached the rate limit
                try {
                    Thread.sleep(1000 - elapsedTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                requestsThisSecond = 0;
                startTime = System.currentTimeMillis();
            }

            // Use a rate limiter to control the rate of API requests
            try {
                rateLimiter.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Submit expression evaluation task to the thread pool
            executorService.submit(() -> {
                try {
                    String result = evaluateExpression(httpClient, expression);
                    System.out.println(expression + " => " + result);
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    rateLimiter.release();
                }
            });

            requestsThisSecond++;
        }

        // Shutdown the thread pool and wait for all tasks to complete
        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private static String evaluateExpression(HttpClient httpClient, String expression) throws IOException {
        String apiUrl = API_ENDPOINT + expression;
        HttpGet request = new HttpGet(apiUrl);

        HttpResponse response = httpClient.execute(request);

        if (response.getStatusLine().getStatusCode() == 200) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            StringBuilder result = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
            return result.toString();
        } else {
            return "Error: Failed to evaluate expression";
        }
    }
}
