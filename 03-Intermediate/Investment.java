import java.util.Scanner;

public class Investment {
    
    public static void main(String[] args) {
        
        System.out.println("Future Investment Value");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Investment : ");
        int i = in.nextInt();
        System.out.print("Enter Rate : ");
        int r = in.nextInt();
        System.out.print("Enter Time : ");
        int t = in.nextInt();

        double value = i * Math.pow(( 1 + r ),t);
        System.out.println("Future Value : " + value);

    }

}
