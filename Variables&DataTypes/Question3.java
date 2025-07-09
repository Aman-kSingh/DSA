Question3:Entercostof3itemsfromtheuser(usingfloatdatatype)-apencil,apenandan eraser. You have to output the total cost of the items back to the user as their bill.

  
  import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the cost of pencil");
        float p1= sc.nextFloat();
        System.out.println("Enter the cost of pen");
        float p2= sc.nextFloat();
        System.out.println("Enter the cost of eraser");
        float e= sc.nextFloat();
        
        float Totalbill= (p1+p2+e);
        
        double gst=  Totalbill*0.18;
        double FinalPrice = Totalbill+gst;
        System.out.print("Total cost of the item:"+ FinalPrice);
    }
}

