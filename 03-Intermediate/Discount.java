import java.util.Scanner;

public class Discount {
    
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Calculate Discount Of Product");
        System.out.print("Enter Product Amount : ");
        int amt = in.nextInt();
        System.out.print("Enter Discount(%) : ");
        int d = in.nextInt();
        double discount = ( d * amt ) / 100;
        System.out.println("Discount Amount : " + discount);

    }

}
