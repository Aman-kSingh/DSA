//Write a program to find the factorialof any number entered by the user.
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        long fact = 1; // use long to handle larger factorials

        // Calculate factorial
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        // Output
        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
