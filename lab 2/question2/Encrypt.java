
import java.util.*;

public class Encrypt {
    private String encrypted; // final key
    private ArrayList<Integer> bucket = new ArrayList<Integer>(); // array of the digits

    public Encrypt() {
        this("0000");
    }

    public Encrypt(String encrypted) {
        this.encrypted = encrypted;
    }

    // get the encrypted value
    public String getEncrypted() {
        return this.encrypted;
    }

    // create a string of numbers that is displayed back to the user
    private void setEncryption() {
        this.encrypted = "";// empty the encrypted string
        for (int index = 0; index < 4; index++) {
            this.encrypted += this.bucket.get(index);
        }
        this.bucket.clear(); // clear memory
    }

    // accepts the value, validates and applies the encryption process
    public void encrypt(String userValue) {
        if (isValid(userValue)) {
            myEncryption(userValue);
        } else
            return;
    }

    // validates user input, check if the input string is
    private static boolean isValid(String userInput) {
        if (userInput.length() == 4) {
            // Ensure that only integer values are in the input
            if (userInput.matches("[0-9]+")) {
                return true;
            }
        }
        return false;
    }

    // Apply encryption algorithm
    private void myEncryption(String userValue) {

        for (int index = 0; index < userValue.length(); index++) {
            int number = Character.getNumericValue(userValue.charAt(index)); // gets the numerical value of the char in
                                                                             // the string
            number += 7; // add 7 to the value stored in number variable
            number %= 10; // get the remainder after dividing by 10
            this.bucket.add(number); // append the result to the storage space
        }
        swapBucket();
        setEncryption();
    }

    // swap the values of the backet
    private void swapBucket() {
        ArrayList<Integer> simpleBuffer = new ArrayList<Integer>();

        simpleBuffer = this.bucket;

        for (int index = 0; index < 4; index++) {
            int num = 0; // must temporal storage for the value on index

            switch (index) {
                case 0: // swap on index 0 with index 2
                    num = simpleBuffer.get(2);
                    simpleBuffer.set(2, simpleBuffer.get(0));
                    simpleBuffer.set(0, num);
                    break;
                case 1: // swap on index 1 with index 3
                    num = simpleBuffer.get(3);
                    simpleBuffer.set(3, simpleBuffer.get(1));
                    simpleBuffer.set(1, num);
                    break;
                default:
                    return;
            }
        }
        this.bucket = simpleBuffer; // update the bucket
        simpleBuffer.clear(); // release memory
    }

}