import java.util.Scanner;

public class Cylinder {
    
    public static void main(String[] args) {
        
        System.out.println("Volume of Cylinder");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        int r = in.nextInt();
        System.out.print("Enter Height : ");
        int h = in.nextInt();

        double volume = (3.14) * ( r * r ) * h;
        System.out.println("Volume of Cylinder : " + volume);

    }
    
}
