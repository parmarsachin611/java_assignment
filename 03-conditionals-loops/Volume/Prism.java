import java.util.Scanner;

public class Prism {
    
    public static void main(String[] args) {
        
        System.out.println("Volume Of Prism");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Base : ");
        int b = in.nextInt();
        System.out.print("Enter Height : ");
        int h = in.nextInt();

        double volume = b * h;
        System.out.println("Volume : " + volume);

    }
    
}
