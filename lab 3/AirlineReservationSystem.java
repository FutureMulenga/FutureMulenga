import java.util.Scanner;

public class AirlineReservationSystem {
    private static final int FIRST_CLASS_SEATS = 5;
    private static final int ECONOMY_SEATS = 10;
    static boolean[] seats = new boolean[FIRST_CLASS_SEATS + ECONOMY_SEATS];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Airline Reservation System");

        while (true) {
            int seatType = getSeatType();
            int seatNumber = assignSeat(seatType);

            if (seatNumber == -1) {
                System.out.println("Next flight leaves in 3 hours.");
                break;
            }

            printBoardingPass(seatNumber, seatType);
        }
    }

    static int getSeatType() {
        while (true) {
            System.out.println("Please type 1 for First Class or 2 for Economy:");
            int seatType = scanner.nextInt();
            if (seatType == 1 || seatType == 2) {
                return seatType;
            }
        }
    }

    static int assignSeat(int seatType) {
        int seatNumber = -1;

        if (seatType == 1) {
            seatNumber = assignFirstClassSeat();
            if (seatNumber == -1) {
                System.out.println("First Class is full. Would you like an Economy seat instead? (y/n)");
                String answer = scanner.next();
                if (answer.equalsIgnoreCase("y")) {
                    seatNumber = assignEconomySeat();
                }
            }
        } else if (seatType == 2) {
            seatNumber = assignEconomySeat();
            if (seatNumber == -1) {
                System.out.println("Economy is full. Would you like a First Class seat instead? (y/n)");
                String answer = scanner.next();
                if (answer.equalsIgnoreCase("y")) {
                    seatNumber = assignFirstClassSeat();
                }
            }
        }

        return seatNumber;
    }

    static int assignFirstClassSeat() {
        for (int i = 0; i < FIRST_CLASS_SEATS; i++) {
            if (!seats[i]) {
                seats[i] = true;
                return i;
            }
        }
        return -1;
    }

    public static int assignEconomySeat() {
        for (int i = 5; i < 10; i++) {
            if (!seats[i]) {
                seats[i] = true;
                return i + 1; // increment seat number by 1 to match user display
            }
        }
        return -1;
    }
    private static void printBoardingPass(int seatNumber, int seatType) {
        System.out.println("Boarding pass");
        System.out.println("Seat number: " + (seatNumber + 1));
        if (seatType == 1) {
            System.out.println("Seat type: First Class");
        } else {
            System.out.println("Seat type: Economy");
        }
    }
}
