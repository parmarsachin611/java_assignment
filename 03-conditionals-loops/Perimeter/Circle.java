import java.util.Scanner;

public class Circle {
    
    public static void main(String[] args) {
        
        System.out.println("Perimeter Of Circle");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius : ");
        int r = in.nextInt();
        in.close();

        double perimeter = 2 * 3.14 * r;
        System.out.println("Perimeter : " + perimeter);

    }

}
