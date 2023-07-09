import java.util.Scanner;

public class Equilateral {
    
    public static void main(String[] args) {
        
        System.out.println("Perimeter Of Equilateral Triangle");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Perimeter : ");
        int s = in.nextInt();
        in.close();

        double perimeter = 3 * s;
        System.out.println("Perimeter : " + perimeter);

    }

}
