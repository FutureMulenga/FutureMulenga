import java.util.Random;

public class RollDice {
    
    private Random random;
    
    public RollDice() {
        random = new Random();
    }
    
    public int[] rollDice(int numRolls) {
        int[] frequency = new int[13];
        
        // Roll the dice the specified number of times and tally the frequency of each sum
        for (int i = 0; i < numRolls; i++) {
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            int sum = die1 + die2;
            frequency[sum]++;
        }
        
        return frequency;
    }
    
}
