//Write a program to print the multiplication table of a number N, entered by the users


import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number N: ");
        int n = scanner.nextInt();
        
        System.out.println("\nMultiplication table of " + n + ":");
        System.out.println("------------------------");
        
        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }
        
        scanner.close();
    }
}
