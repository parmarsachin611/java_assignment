import java.util.Scanner;

public class Cube {
    
    public static void main(String[] args) {
        
        System.out.println("Total Surface Area Of Cube");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Side : ");
        int s = in.nextInt();

        double area = 6 * (s * s);
        System.out.println("Area : " + area);

    }

}
