import org.junit.Test;
import static org.junit.Assert.*;

public class RollDiceTest {

    @Test
    public void testRollDice() {
        // Create a new RollDice object to test
        RollDice rollDice = new RollDice();

        // Set the number of rolls to perform in the simulation
        int numRolls = 36000000;

        // Define the expected frequencies for each possible sum of the two dice
        int[] expectedFrequencies = {0, 0, 1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1};

        // Roll the dice and record the actual frequencies of each possible sum
        int[] actualFrequencies = rollDice.rollDice(numRolls);

        // Check that the actual frequencies are within a certain range of the expected frequencies
        for (int i = 2; i <= 12; i++) {
            // Calculate the expected frequency for the current sum
            double expected = expectedFrequencies[i] * numRolls / 36.0;

            // Get the actual frequency for the current sum
            double actual = actualFrequencies[i];

            // Calculate the tolerance for the current sum (allowing for +/- 1% error)
            double tolerance = expected * 0.01;

            // Construct a message for any failed assertions
            String message = String.format("Frequency of %d is outside expected range", i);

            // Check that the actual frequency is within the expected range
            assertEquals(message, expected, actual, tolerance);
        }
    }

}
