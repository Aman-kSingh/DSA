import java.util.*;

// Average of 3 numbers
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int A = sc.nextInt();

        System.out.print("Enter second number: ");
        int B = sc.nextInt();

        System.out.print("Enter third number: ");
        int C = sc.nextInt();

        int average = (A + B + C) / 3;

        System.out.println("Average is: " + average);
    }
}
