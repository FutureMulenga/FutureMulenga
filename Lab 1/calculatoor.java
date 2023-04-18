
/*author: Future mulenga
purpose: this program calculates the product of three integer values */


import java.util.*; // importing the scann libray 


public class Calculatoor{
 
                  
               public static void main(String[] args){
                              
               Scanner input = new Scanner(System.in);
                  
                       int x, y, z;

                       
                     
                     // prompt the user to enter the first number  
                     System.out.print("Enter first number: ");
                     x = input.nextInt();
                                           
                     //prompt the user to enter the first number
                     System.out.print("Enter second number: ");
                     y = input.nextInt();
        
                     // prompt the user enter the third number 
                     System.out.print("Enter third number: ");
                     z = input.nextInt();

                     /*computes the the product of the  three numbers
                      entered by the user and store in the result variable*/
                      
                      int result = (x*y*z);

                      //display the results to the screen 
                      System.out.printf("The product = ");
                      System.out.println(result); 

                     


                 }
                    
                   


                        }
 