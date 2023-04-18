
/*
 * lecturer: Mr Chibuluma
 * 
 * The heart rate calculator, lab 2
 */
import java.time.LocalDateTime;
import java.time.LocalDate;

/*
 * 
 * This class provides the blueprint for the heart calculator 
 * @author      Future MULENGA
 * @SIN         20148647
 */
public class HeartRates {
    private String firstName;
    private String surName;
    private LocalDate birthDate;
    private double maxHeartRate;

    // Empty constructor
    public HeartRates() {

    }

    // this is th constructor
    public HeartRates(String firstName, String surName, LocalDate birthdate, double maxHeartRate) {
        this.firstName = firstName;
        this.surName = surName;
        this.maxHeartRate = maxHeartRate;
        this.birthDate = birthdate;

    }

    // set the first name
    public void setFirstName(String firstName) {
        if (validateName(firstName)) {
            this.firstName = firstName;
        } else
            return; // conditional operator failed here.
    }

    // get first name
    public String getFirstName() {
        return this.firstName;
    }

    // set the surname
    public void setSurname(String surName) {
        if (validateName(surName)) {
            this.surName = surName;
        } else
            return; // conditional operator failed here.
    }

    // get surname
    public String getSurname() {
        return this.firstName;
    }

    // get target heart rate
    public double getMaxHeartRate() {
        return this.maxHeartRate;
    }

    // set max heartrate
    public void setMaxHeartRate() {
        int HEART_RATE_COEFFICIENT = 220;
        LocalDateTime today = LocalDateTime.now();
        this.maxHeartRate = HEART_RATE_COEFFICIENT - (today.getYear() - birthDate.getYear());

    }

    // set the birth date
    public void setBirthDate(int day, int month, int year) {
        LocalDate birthDate = LocalDate.of(year, month, day);
        this.birthDate = birthDate;
        this.setMaxHeartRate();
    }

    // print lower range
    double getLowerRange() {
        return this.maxHeartRate * 0.50;
    }

    // print lower range
    double getUpperRange() {
        return this.maxHeartRate * 0.85;
    }

    // get full name
    String getFullName() {
        return this.firstName + " " + this.surName;
    }

    // validate that the user has a valid name
    private static boolean validateName(String name) {
        if (name.length() >= 4) { // conditional failed here too.
            return true;
        }
        return false;
    }

}