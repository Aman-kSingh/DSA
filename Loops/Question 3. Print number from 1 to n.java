//Print number from 1 to n

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the n");
        int n=sc.nextInt();
        int num=1;
        

        while(num <= n ){
            System.out.print(num+" ");
            num++;
        }
    }
}
