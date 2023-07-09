import java.util.*;

public class Distance {
    
    public static void main(String[] args) {
        
        System.out.println("Calculate Distance Between Two Points");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter X1 : ");
        int x1 = in.nextInt();
        System.out.print("Enter Y1 : ");
        int y1 = in.nextInt();
        System.out.print("Enter X2 : ");
        int x2 = in.nextInt();
        System.out.print("Enter Y2 : ");
        int y2 = in.nextInt();
        in.close();

        double distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("Distance : " + distance);

    }

}
