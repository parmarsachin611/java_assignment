import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {
        
        System.out.println("Volume of Pyramid");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length : ");
        int l = in.nextInt();
        System.out.print("Enter width : ");
        int w = in.nextInt();
        System.out.print("Enter height : ");
        int h = in.nextInt();

        double volume = (l*w*h)/3;
        System.out.println("Volume of Pyramid : " + volume);

    }
    
}
