import java.util.Scanner;

public class Rhombus {
    
    public static void main(String[] args) {
        
        System.out.println("Perimeter Of Rhombus");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Side : ");
        int s = in.nextInt();
        
        double perimeter = 4 * s;
        System.out.println("Perimeter of Rhombus : " + perimeter);

    }
    
}
