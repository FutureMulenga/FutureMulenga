
import java.util.*; //this library contain the scan   

public class my_calculator{
 
            public static void main(String[] args){
                  
                       Scanner sc = new Scanner(System.in);
                       
                       System.out.print("1. addion\n");
                       System.out.print("2. subtraction\n");
                       System.out.print("3. multipliction\n");
                       System.out.print("4. division\n\n");

                       

                       System.out.print("enter  first number: ");
                       int x= sc.nextInt();
                       System.out.print("Enter second number: ");
                       int y= sc.nextInt();
                       

                       System.out.print("Enter option: ");
                       int option = sc.nextInt();
                        

                       //this control structure determines the operation to operate on the operands
                       if(option == 1){
                       int result =x +y;
                       System.out.print("The sum = " + result);}


                       if(option == 2){
                       int result = y - x;
                       System.out.print("The difference = " + result);}

		           if(option == 3){
                       int result = y * x;
                       System.out.print("The product= " + result);}

                         
                       if(option == 2){
                       int result = y / x;
                       System.out.print("The quotient= " + result);}

                       
                     
       }

    		public static int main(int num1, int num2){
                    
                              return(num1 + num2);
                        } 

}
                                                
