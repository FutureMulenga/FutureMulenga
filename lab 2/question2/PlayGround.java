
/*
 * This is a playground for making adjustments without affecting the original code.
 * For those that do not know java
 * 
 * Try to convert the int stream to string then work on it as a string and convert it back to an integer
 * That is the main working of the program
 */
import java.util.*;

public class PlayGround {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.print("Enter number: ");
            choice = input.nextInt();
        } while (choice != 3);

        input.close();
    }
}
