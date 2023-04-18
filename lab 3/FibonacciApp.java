import java.util.Scanner;

public class FibonacciApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        input.close();
        
        int fibonacci = Fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is " + fibonacci + ".");
    }
    
    public static int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
