package com.onlinesales;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class EventSimulationTest {

	@Test
	public void testSimulateEvent_withValidProbabilities_shouldReturnExpectedOutcomes() {
		// Define outcome probabilities for testing
		Map<Object, Double> outcomeProbabilities = new LinkedHashMap<>();
		outcomeProbabilities.put(1, 10.0);
		outcomeProbabilities.put(2, 30.0);
		outcomeProbabilities.put(3, 15.0);
		outcomeProbabilities.put(4, 15.0);
		outcomeProbabilities.put(5, 30.0);
		outcomeProbabilities.put(6, 0.0);

		// Create the EventSimulation instance
		EventSimulation event = new EventSimulation(outcomeProbabilities);

		// Perform a large number of simulations
		int numSimulations = 100000;
		Map<Object, Integer> outcomeCounts = new LinkedHashMap<>();

		for (int i = 0; i < numSimulations; i++) {
			Object outcome = event.simulateEvent();
			outcomeCounts.put(outcome, outcomeCounts.getOrDefault(outcome, 0) + 1);
		}

		// Check if the outcomes roughly match the expected probabilities
		for (Map.Entry<Object, Double> entry : outcomeProbabilities.entrySet()) {
			double expectedProbability = entry.getValue() / 100.0;
			double actualProbability = (double) outcomeCounts.getOrDefault(entry.getKey(), 0) / numSimulations;
			double tolerance = 0.01; // Adjust the tolerance as needed

			assertEquals(expectedProbability, actualProbability, tolerance,
					"Outcome " + entry.getKey() + " probability does not match the expected value");
		}
	}

	@Test
	public void testSimulateEvent_withInvalidProbabilities_shouldReturnValidOutcomes() {
		// Define outcome probabilities for testing (total probability exceeds 100%)
		Map<Object, Double> invalidProbabilities = new LinkedHashMap<>();
		invalidProbabilities.put(1, 60.0);
		invalidProbabilities.put(2, 50.0);

		// Create the EventSimulation instance with invalid probabilities
		EventSimulation invalidEvent = new EventSimulation(invalidProbabilities);

		// Attempt to simulate an event multiple times; outcomes should be valid (not
		// null)
		for (int i = 0; i < 1000; i++) {
			Object outcome = invalidEvent.simulateEvent();
			assertNotNull(outcome, "Outcome should not be null for invalid probabilities");
		}
	}

	@Test
	public void testSimulateEvent_withValidDiceProbabilities_shouldReturnExpectedOutcomes() {
		// Define outcome probabilities for a biased dice
		Map<Object, Double> diceProbabilities = new LinkedHashMap<>();
		diceProbabilities.put(1, 10.0);
		diceProbabilities.put(2, 30.0);
		diceProbabilities.put(3, 15.0);
		diceProbabilities.put(4, 15.0);
		diceProbabilities.put(5, 30.0);
		diceProbabilities.put(6, 0.0);

		// Create the EventSimulation instance
		EventSimulation diceEvent = new EventSimulation(diceProbabilities);

		// Perform simulations and validate outcomes
		validateEventProbabilities(diceEvent, diceProbabilities);
	}

	@Test
	public void testSimulateEvent_withValidCoinProbabilities_shouldReturnExpectedOutcomes() {
		// Define outcome probabilities for a biased coin
		Map<Object, Double> coinProbabilities = new LinkedHashMap<>();
		coinProbabilities.put("Head", 35.0);
		coinProbabilities.put("Tail", 65.0);

		// Create the EventSimulation instance
		EventSimulation coinEvent = new EventSimulation(coinProbabilities);

		// Perform simulations and validate outcomes
		validateEventProbabilities(coinEvent, coinProbabilities);
	}

	private void validateEventProbabilities(EventSimulation event, Map<Object, Double> probabilities) {
		int numSimulations = 100000;
		Map<Object, Integer> outcomeCounts = new LinkedHashMap<>();

		for (int i = 0; i < numSimulations; i++) {
			Object outcome = event.simulateEvent();
			outcomeCounts.put(outcome, outcomeCounts.getOrDefault(outcome, 0) + 1);
		}

		// Check if the outcomes roughly match the expected probabilities
		for (Map.Entry<Object, Double> entry : probabilities.entrySet()) {
			double expectedProbability = entry.getValue() / 100.0;
			double actualProbability = (double) outcomeCounts.getOrDefault(entry.getKey(), 0) / numSimulations;
			double tolerance = 0.01; // Adjust the tolerance as needed

			assertEquals(expectedProbability, actualProbability, tolerance,
					"Outcome " + entry.getKey() + " probability does not match the expected value");
		}
	}

	@Test
	public void testSimulateEvent_withValidProbabilities_shouldReturnNonNullOutcomes() {
		// Define outcome probabilities for testing (total probability is 100%)
		Map<Object, Double> validProbabilities = new LinkedHashMap<>();
		validProbabilities.put(1, 10.0);
		validProbabilities.put(2, 30.0);
		validProbabilities.put(3, 15.0);
		validProbabilities.put(4, 15.0);
		validProbabilities.put(5, 30.0);
		validProbabilities.put(6, 0.0);

		// Create the EventSimulation instance with valid probabilities
		EventSimulation validEvent = new EventSimulation(validProbabilities);

		// Attempt to simulate an event multiple times; outcomes should not be null
		for (int i = 0; i < 1000; i++) {
			Object outcome = validEvent.simulateEvent();
			assertNotNull(outcome, "Outcome should not be null for valid probabilities");
		}
	}

}
