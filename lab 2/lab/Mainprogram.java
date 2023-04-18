package lab 2;

import java.util.*;

public class Mainprogram{


        public static void main(String[] args)
        {
           Scanner input = new Scanner(System.in);
     
           int fourDigits;
           byte option; 
           
            encryption num1 = new encryption();

           System.out.print("Enter number: ");
           fourDigits= input.nextInt();
     
           System.out.println("1. Encrypt\n");
           System.out.println("2. Decrypt\n");
           System.out.print("Enter option:");
           option = input.nextByte();
     
     
                switch (option) 
                {
                    case 1:
                        encrypty(fourDigits);
                        break;
                    case 2:
                        decrypty();
                        break;
                    default:
                        System.err.print("invalid option");
                }
              
           input.close();
        }
           
    }
