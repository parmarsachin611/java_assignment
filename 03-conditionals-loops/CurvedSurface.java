import java.util.Scanner;

public class CurvedSurface {
    
    public static void main(String[] args) {
        
        System.out.println("Curved Surface Area Of Cylinder");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius : ");
        int r = in.nextInt();
        System.out.print("Enter height : ");
        int h = in.nextInt();

        double area = (3.14) * r * h;
        System.out.println("Curved Surface Area Of Cylinder : " + area);


    }

}
