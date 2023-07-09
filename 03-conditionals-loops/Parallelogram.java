import java.util.Scanner;

public class Parallelogram {
    
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Area of a parallelogram (A) using its adjacent sides");
        System.out.print("Enter one adjacent side : ");
        int a = in.nextInt();
        System.out.print("Enter other adjacent side : ");
        int b = in.nextInt();
        double x = angle();
        in.close();

        double area = a * b * Math.sin(x);
        System.out.println("Area of Parallelogram : " + area);

    }

    static double angle() {

        System.out.print("Enter angle formed by sides : ");
        double k = in.nextInt();

        if (k >= 180) {
            System.out.println("Invalid Angle, Try Again!");
            angle();
        }

        return k;

    }

}
