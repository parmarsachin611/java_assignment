import java.util.Scanner;

public class Dollar {
    
    public static void main(String[] args) {
        
        // Input currency in rupees and output in USD

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Rupees : ");
        float rupees = in.nextFloat();
        in.close();
        
        double dollar = rupees / 80;
        System.out.println("Dollar : " + dollar);

    }

}

