import java.util.Scanner;

public class Equilateral {
    
    public static void main(String[] args) {
        
        System.out.println("Area Of Equilateral Triangle");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Side : ");
        int s = in.nextInt();

        double area = (Math.sqrt(3)/4) * ( s * s );
        System.out.println("Area : " + area);

    }

}

