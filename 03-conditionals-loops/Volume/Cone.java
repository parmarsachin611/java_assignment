import java.util.Scanner;

public class Cone {

    public static void main(String[] args) {
        
        System.out.println("Volume of Cone");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        int r = in.nextInt();
        System.out.print("Enter Height : ");
        int h = in.nextInt();

        double volume = (3.14) * ( r * r ) * ( h/3 );
        System.out.println("Volumne of Cone : " + volume);

    }
    
}
