import static org.junit.Assert.assertEquals; // Importing the assertEquals method from JUnit Assert class
import org.junit.Test;

public class FibonacciAppTests {
    
    @Test // Marking the following method as a test case
    public void testFibonacci() {
        // Checking the expected value with the actual value returned by the method for different input values
        assertEquals(0, FibonacciApp.Fibonacci(0)); // Base case 1: when input is 0, the result should be 0
        assertEquals(1, FibonacciApp.Fibonacci(1)); // Base case 2: when input is 1, the result should be 1
        assertEquals(1, FibonacciApp.Fibonacci(2)); // For input value 2, the result should be 1 (0+1)
        assertEquals(2, FibonacciApp.Fibonacci(3)); // For input value 3, the result should be 2 (1+1)
        assertEquals(3, FibonacciApp.Fibonacci(4)); // For input value 4, the result should be 3 (1+2)
        assertEquals(5, FibonacciApp.Fibonacci(5)); // For input value 5, the result should be 5 (2+3)
        assertEquals(8, FibonacciApp.Fibonacci(6)); // For input value 6, the result should be 8 (3+5)
        assertEquals(13, FibonacciApp.Fibonacci(7)); // For input value 7, the result should be 13 (5+8)
        assertEquals(21, FibonacciApp.Fibonacci(8)); // For input value 8, the result should be 21 (8+13)
        assertEquals(34, FibonacciApp.Fibonacci(9)); // For input value 9, the result should be 34 (13+21)
    }
}
