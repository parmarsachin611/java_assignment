import java.util.Scanner;

public class Commission {

    public static void main(String[] args) {
        
        System.out.println("Calculate Commission Percentage");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Amount : ");
        int amount = in.nextInt();
        System.out.print("Enter Commission : ");
        int commission = in.nextInt();
        in.close();

        float rate = (commission * 100) / amount ;
        System.out.println("Commission Rate : " + rate + " %");

    }

}