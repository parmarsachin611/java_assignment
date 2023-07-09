import java.util.Scanner;

public class AreaTriangle {
    
    public static void main(String[] args) {
        
        // Area Of Triangle
        Scanner in = new Scanner(System.in);
        System.out.println("Area of Triangle");
        System.out.print("Enter Height : ");
        int h = in.nextInt();
        System.out.print("Enter Base : ");
        int b = in.nextInt();
        in.close();

        double area = (h*b) / 2;
        System.out.println("Area : " + area);

    }

}
