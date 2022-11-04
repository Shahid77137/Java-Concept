package com.onlinesales;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpressionEvaluatorTest {

    @Test
    public void testExpressionEvaluation() {
        // Simulate user input
        String input = "2 * 4 * 4\n5 / (7 - 5)\nsqrt(5^2 - 4^2)\nsqrt(-3^2 - 4^2)\nend\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Redirect console output to capture it
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        // Run the main program
        ExpressionEvaluator.main(null);

        // Restore standard input and output
        System.setIn(System.in);
        System.setOut(System.out);

        // Extract and verify the output
        String output = outputStream.toString().trim();
        String expectedOutput = "2 * 4 * 4 => 32\n5 / (7 - 5) => 2.5\nsqrt(5^2 - 4^2) => 3\nsqrt(-3^2 - 4^2) => 5i";
        assertEquals(expectedOutput, output);
    }

    @Test
    public void testRateLimiting() throws InterruptedException {
        // Simulate user input with a large number of expressions
        StringBuilder inputBuilder = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            inputBuilder.append("2 + 2\n");
        }
        inputBuilder.append("end\n");
        String input = inputBuilder.toString();

        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Redirect console output to capture it
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Run the main program
        ExpressionEvaluator.main(null);

        // Restore standard input and output
        System.setIn(System.in);
        System.setOut(originalOut);

        // Extract and verify the output
        String output = outputStream.toString().trim();
        String[] outputLines = output.split("\n");
        String expectedOutput = "2 + 2 => 4";
        
        // Check that the output contains the expected lines
        for (int i = 0; i < 50; i++) {
            assertEquals(expectedOutput, outputLines[i]);
        }
        
        // Check that there are no extra lines in the output
        assertEquals(51, outputLines.length); // 50 lines of output + 1 empty line

        // Add a sleep delay to simulate rate limiting
        Thread.sleep(1000); // Sleep for 1 second to simulate rate limiting (adjust as needed)
    }

}
