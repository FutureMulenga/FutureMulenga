import javax.swing.JOptionPane;

public class AccountApp {

    public static void main(String[] args) {
        Account account1 = new Account("future", 1000, 0, 0, null);

        // this is the menu
        JOptionPane.showMessageDialog(null, "1.Create a new account\n 2.Login ");
        String option = JOptionPane.showInputDialog("Choose option");

        // chosing option
        if (Integer.valueOf(option) == 1) {
            String name = JOptionPane.showInputDialog("Enter your name: ");
            String nrcNumber = JOptionPane.showInputDialog("Enter your NRC number: ");
            String phoneNumber = JOptionPane.showInputDialog("Enter your phone number: ");
            String securityQuestion = JOptionPane.showInputDialog("Enter security question: ");

            account1.setDetails(Integer.valueOf(phoneNumber), Integer.valueOf(nrcNumber), name, securityQuestion);

        } else if (Integer.valueOf(option) == 2)// convert the string to double
        {
            String Password = JOptionPane.showInputDialog("enter your password: ");

            if (Integer.valueOf(Password) == 1234)// checks if the password is valid
            {
                // shows the menu
                JOptionPane.showMessageDialog(null, "1.Deposit\n 2.Withdraw");
                String option2 = JOptionPane.showInputDialog("Choose option");

                if (Integer.valueOf(option2) == 1) {
                    String amount1 = JOptionPane.showInputDialog("Enter deposit amount: ");
                    account1.deposit(Double.valueOf(amount1));// convert the string to double
                    String message1 = String.format("%S your balance is %.2f", account1.getName(),
                            account1.getBalance());
                    JOptionPane.showMessageDialog(null, message1);

                } else if (Integer.valueOf(option2) == 2) {
                    String amout = JOptionPane.showInputDialog("Enter Withdraw Amount: ");
                    account1.withdraw(Double.valueOf(amout));// passing withdraw amount into withdrae method

                    // checks if the customer is allowed to withdraw money
                    if (account1.getBalance() >= 0) {
                        String message2 = String.format(
                                " Your have successfully withdrawn %.2f,Your New Balance is: %.2f",
                                Double.valueOf(amout), account1.getBalance());
                        JOptionPane.showMessageDialog(null, message2);
                    } else if (account1.getBalance() < 0) {
                        String message3 = String.format("insuffient balance");
                        JOptionPane.showMessageDialog(null, message3);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "invalid password");

            }

        }

    }

}
