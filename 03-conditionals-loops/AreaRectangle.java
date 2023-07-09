import java.util.Scanner;

public class AreaRectangle {
    
    public static void main(String[] args) {
        
        System.out.println("Area Of Rectangle Program");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Width : ");
        float width = in.nextFloat();
        System.out.print("Enter Height : ");
        float height = in.nextFloat();
        in.close();
        
        double area = width * height;
        System.out.println("Area : " + area);

    }

}
