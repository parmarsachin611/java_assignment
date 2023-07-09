import java.util.Scanner;

public class Parallelogram {
    
    public static void main(String[] args) {
        
        System.out.println("Perimeter Of Parallelogram");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter one side : ");
        int a = in.nextInt();
        System.out.print("Enter other side : ");
        int b = in.nextInt();

        double perimeter = 2 * ( a + b );
        System.out.println("Perimeter Of Parallelogram : " + perimeter);

    }

}
