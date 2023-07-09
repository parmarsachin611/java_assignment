import java.util.Scanner;

public class Square {
    
    public static void main(String[] args) {
        
        System.out.println("Perimeter Of Square");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Side : ");
        int s = in.nextInt();

        double perimeter = 4 * s;
        System.out.println("Perimeter of Square : " + perimeter);

    }

}
