import java.util.Scanner;

public class AreaCircle {

    public static void main(String[] args) {
        
        // Area Of Circle Java Program

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        float radius = in.nextFloat();
        in.close();

        double area = 3.14 * (radius * radius);
        System.out.println("Area of Circle : " + area);

    }

}