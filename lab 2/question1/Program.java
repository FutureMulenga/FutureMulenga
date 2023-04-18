
/*
* date: 03-02-2023
* lecturer: Mr Chibuluma
* 
* The heart rate calculator, lab 2
*/

import java.util.*;

/*
 * 
 * This class provides the blueprint for the heart calculator 
 * 
 * @author      Gilbert Ng'andu
 * @student no. 20153347
 */
public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create scanner object
        HeartRates user = new HeartRates(); // create HeartRates object
        int day = 0;
        int month = 0;
        int year = 0;

        System.out.print("Enter first name: ");
        user.setFirstName(input.next());

        System.out.print("Enter surname: ");
        user.setSurname(input.next());

        // get user date birth date
        System.out.print("Enter date of birth ");
        System.out.print("\nEnter day: ");
        day = input.nextInt();
        System.out.print("Enter month: ");
        month = input.nextInt();
        System.out.print("Enter year: ");
        year = input.nextInt();

        user.setBirthDate(day, month, year);
        // user.setMaxHeartRate();

        printInformation(user.getFullName(), user.getMaxHeartRate(), user.getLowerRange(), user.getUpperRange());

        input.close();
    }

    public static void printInformation(String name, double maxHeartRate, double lowerRange, double upperRange) {
        System.out.printf("%nHello %s's Information.%n", name);
        System.out.print("---------------------------------------------------------\n");
        System.out.print("Maximum heart rate\tHeart Rate Range\n");
        System.out.print("---------------------------------------------------------\n");
        System.out.printf("%.2f\t\t\t%.2f - %.2f", maxHeartRate, lowerRange, upperRange);
        System.out.print(
                "\n\nNote: Maximum and target heart rates may vary based on\nthe health, fitness and gender of the individual.");
        System.out.print("\n---------------------------------------------------------\n");
    }

}