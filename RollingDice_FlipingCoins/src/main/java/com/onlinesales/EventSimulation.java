package com.onlinesales;

import java.util.*;

public class EventSimulation {

	// Here Storing the outcome probabilities for the event
    private Map<Object, Double> outcomes;

    // Here Initializing a random number generator
    private Random random;

    // Here initializing the event with their outcome probabilities
    public EventSimulation(Map<Object, Double> outcomes) {
        this.outcomes = outcomes;
        this.random = new Random();
    }

    // Here Simulating a single event occurrence and return the object(Key of the map) as outcome
    public Object simulateEvent() {
        // Generate a random number between 0 and 100
        double rand = random.nextDouble() * 100;
        
        // Initialize cumulative probability
        double cumulativeProbability = 0;

        // Iterate through outcome probabilities
        for (Map.Entry<Object, Double> entry : outcomes.entrySet()) {
            cumulativeProbability += entry.getValue();
            
            // If the random number falls within the cumulative probability, return the outcome
            if (rand <= cumulativeProbability) {
                return entry.getKey();
            }
        }

        // This should not happen if probabilities are correctly defined.otherwise it will return null
        return null;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of simulations for rolling a biased dice
        System.out.println("Enter the number of simulations for rolling a biased dice:");
        int numDiceOccurrences = scanner.nextInt();

        // Define outcome probabilities for the biased dice
        Map<Object, Double> diceProbabilities = new LinkedHashMap<>();
        diceProbabilities.put(1, 10.0);
        diceProbabilities.put(2, 30.0);
        diceProbabilities.put(3, 15.0);
        diceProbabilities.put(4, 15.0);
        diceProbabilities.put(5, 30.0);
        diceProbabilities.put(6, 0.0);

        // Create an EventSimulation instance for the biased dice
        EventSimulation diceEvent = new EventSimulation(diceProbabilities);

        // Track and count the occurrences of outcomes for the biased dice
        Map<Object, Integer> diceOccurrenceCounts = new LinkedHashMap<>();

        for (int i = 0; i < numDiceOccurrences; i++) {
            Object outcome = diceEvent.simulateEvent();
            diceOccurrenceCounts.put(outcome, diceOccurrenceCounts.getOrDefault(outcome, 0) + 1);
        }

        // Display the results of the dice simulation
        System.out.println("Dice Simulation results:");
        for (Map.Entry<Object, Integer> entry : diceOccurrenceCounts.entrySet()) {
            System.out.println("Outcome " + entry.getKey() + " appeared " + entry.getValue() + " times");
        }

        // Prompt the user to enter the number of simulations for flipping a biased coin
        System.out.println("\nEnter the number of simulations for flipping a biased coin:");
        int numCoinOccurrences = scanner.nextInt();

        // Define outcome probabilities for the biased coin
        Map<Object, Double> coinProbabilities = new LinkedHashMap<>();
        coinProbabilities.put("Head", 35.0);
        coinProbabilities.put("Tail", 65.0);

        // Create an EventSimulation instance for the biased coin
        EventSimulation coinEvent = new EventSimulation(coinProbabilities);

        // Track and count the occurrences of outcomes for the biased coin
        Map<Object, Integer> coinOccurrenceCounts = new LinkedHashMap<>();

        for (int i = 0; i < numCoinOccurrences; i++) {
            Object outcome = coinEvent.simulateEvent();
            coinOccurrenceCounts.put(outcome, coinOccurrenceCounts.getOrDefault(outcome, 0) + 1);
        }

        // Display the results of the coin simulation
        System.out.println("\nCoin Simulation results:");
        for (Map.Entry<Object, Integer> entry : coinOccurrenceCounts.entrySet()) {
            System.out.println("Outcome " + entry.getKey() + " appeared " + entry.getValue() + " times");
        }

        // Close the scanner when done to release resources
        scanner.close();
    }
}
