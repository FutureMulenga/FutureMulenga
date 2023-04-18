
import java.util.*;


public class Cryptography {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        System.out.println("\nWelcome to cryptography");

        System.out.print("\n1. Encrypt\n2. Decrypt\nchoice:");
        choice = input.nextInt();
        menu(choice);

        System.out.print("Do you wish to continue?\n1.Yes\nAny other key to quit.\n");
        if (choice == 1)
            choice = 0;
        else
            choice = 4;

        input.close();
    }

    // Encrypt if user choice is to encrypt
    public static void encrypt() {
        Encrypt myKey = new Encrypt();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter key to encrypt - max 4 digits(e.g 1234): ");
        myKey.encrypt(input.nextLine());

        System.out.printf("%nEncrypted key: %s%n", myKey.getEncrypted());

        input.close();
    }

    // performs the decryption process
    public static void decrypt() {
        Decrypt retrieve = new Decrypt();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter key to decrypt - max 4 digits(e.g 1234): ");
        retrieve.decrypt(input.nextLine());

        System.out.printf("%nDecrypted key: %s%n", retrieve.getKey());

        input.close();
    }

    // menu selection
    public static void menu(int choice) {
        switch (choice) {
            case 1:
                // encrypt
                encrypt();
                break;

            case 2:
                // decrypt
                decrypt();
                break;

            case 3:
                System.out.print("Goodbye :(");
                break;

            default:
                System.out.println("Please select a valid input.");
                break;
        }
    }
}
