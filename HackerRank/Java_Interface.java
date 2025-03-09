import java.util.Scanner;

// Interface definition (provided)
interface AdvancedArithmetic {
    int divisor_sum(int n);
}

// Your class that implements the interface
class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int sum = 0;
        
        // Loop to find divisors of n and sum them
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { // i is a divisor of n
                sum += i;
            }
        }
        
        return sum;
    }
}

public class Solution {
    public static void main(String[] args) {
        // Read input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Create object of MyCalculator
        MyCalculator my_calculator = new MyCalculator();
        
        // Output the implementation statement and the sum of divisors
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(my_calculator.divisor_sum(n));
    }
}
