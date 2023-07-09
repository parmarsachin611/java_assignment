import java.util.Scanner;

public class Sphere {
    
    public static void main(String[] args) {
        
        System.out.println("Volume of Sphere");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        int r = in.nextInt();

        double volume = ((4* (3.14) * (r*r*r))/3) ;
        System.out.println("Volume of Sphere : " + volume);

    }
    
}
