import java.util.Scanner;

//create and manipulate an Account object
public class AccountTest {

        public static void main(String[] args)
        {  
            Scanner input = new Scanner(System.in);

                Account myAccount = new Account("future", 0);
                
                System.out.printf("initail name: %s%n%n", myAccount.getName());
                System.out.printf("initial balance: %s%n%n", myAccount.getBalance());

                System.out.println("Enter the name:");
                String TheName = input.nextLine();
                System.out.println("Enter the deposit amount: ");
                double depositeAmount = input.nextDouble();

                myAccount.deposit(depositeAmount);
                myAccount.setName(TheName);

                

                System.out.printf("Name in the object myAccount is: %s%n%n",myAccount.getName());
                System.out.printf("%s%n balance: $%.2f%n%n", myAccount.getBalance());

        }
    
}
