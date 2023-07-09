import java.util.Scanner;

public class Power {

    public static void main(String[] args) {
        
        System.out.println("Power in Java");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Base : ");
        double b = in.nextDouble();
        System.out.print("Enter Exponent : ");
        double e = in.nextDouble();
        in.close();

        System.out.println("Power : " + Math.pow(e, b));

    }

}