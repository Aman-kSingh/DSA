import java.util.*;

class Main {
    public static void main(String[] args) {
        double tax;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the income");
        int income= sc.nextInt();
        
        if(income<500000){
            tax=0;
        }
        else if(income>500000 && income<=1000000){
            tax=income*(0.2);
        }
        else{
            tax=income*(0.3);
        }
        System.out.print("total tax is:"+ tax + " rupees");
    }
}
