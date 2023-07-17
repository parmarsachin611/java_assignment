import java.util.*;

public class Compound {
    
    public static void main(String[] args) {
        
        System.out.println("Compound Interest");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principal Amount : ");
        int principal = in.nextInt();
        System.out.print("Enter Rate : ");
        float rate = in.nextFloat();
        System.out.print("Enter Period : ");
        int period = in.nextInt();

        double compound = principal * Math.pow( ( 1 + (rate / 100) ), period );
        System.out.println("Compound Interest : " + compound);

    }

}
