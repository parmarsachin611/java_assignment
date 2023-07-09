import java.util.Scanner;

public class Depreciation {
    
    public static void main(String[] args) {
        
        System.out.println("Calculate Depreciation of Value");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Asset : ");
        int asset = in.nextInt();
        System.out.print("Enter Residual : ");
        int residual = in.nextInt();
        System.out.print("Enter Life : ");
        int life = in.nextInt();

        double d = (asset - residual) / life;
        System.out.print("Depreciation : " + d);

    }

}
