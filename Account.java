
public class Account {

    private String name;
    private Double balance;
    private int nrcNumber;
    private int phoneNumber;
    private String SecurityQuestion;

    public Account(String name, double balance, int nrcNumber, int phoneNUmer, String securityQuestion) {
        this.name = name;
        this.nrcNumber = nrcNumber;
        this.phoneNumber = phoneNumber;
        this.SecurityQuestion = SecurityQuestion;

        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    // this method add ammout to the balance
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
        }
    }

    // this method returns the amount of the balance
    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName()

    {
        return name;
    }

    public void withdraw(Double amount) {

        balance = getBalance() - amount;

    }

    // Takes the details of the customer during account creating
    public void setDetails(int phoneNumber, int nrcNumber, String name, String securityQuestion) {
        this.SecurityQuestion = securityQuestion;
        this.nrcNumber = nrcNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

}