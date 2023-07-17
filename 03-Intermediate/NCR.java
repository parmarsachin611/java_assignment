import java.util.*;
public class NCR {
    
    public static void main(String[] args) {
        
        System.out.println("NCR and NPR");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = in.nextInt();
        System.out.print("Enter Rate : ");
        int r = in.nextInt();

        double ncr = fact(n) / (fact(r) * fact(n-r));
        double npr = fact(n) / fact(n-r);

        System.out.println("NPR : " + npr);
        System.out.println("NCR : " + ncr);

    }

    static int fact(int num){

        int fact = 1;
        while (num > 0) {
            
            fact = fact * num;
            num--;
        }

        return fact;

    }

}
