import java.util.*;
import java.math.BigDecimal;

public class Loan {
     
  

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            BigDecimal principle_amount;

            System.out.print("Enter principle amount: ");
            principle_amount= sc.nextBigDecimal();
            totalAmount(principle_amount);


        }

        //calculates the amount to return
        public void totalAmounnt(BigDecimal P_amount)
        {
            double principle_amount=0;
            double interest = 0.05;
            double amount=0;

            for(int year=1; year<=10; year++)
            {
                amount = principle_amount*Math.pow(1 + 0.05, year); 
            }
        } 




}
