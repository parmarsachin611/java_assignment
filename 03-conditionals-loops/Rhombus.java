import java.util.Scanner;

public class Rhombus {
    
    public static void main(String[] args) {
        
        System.out.println("Are of Rhombus");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter one diagonal : ");
        int p =in.nextInt();
        System.out.print("Enter other diagonal : ");
        int q = in.nextInt();
        double area = ( p * q ) / 2;

        System.out.println("Area of Rhombus : " + area);

    }

}
