import java.util.Scanner;

public class Electricity {
    
    public static void main(String[] args) {
        
        System.out.println("Calculate Electricity Bill");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Unit : ");
        int unit = in.nextInt();
        in.close();

        double bill = 0;

        if( unit < 100 ) {
            bill = unit * 1.20;
        } else if(unit < 300) {
            bill = 100 * 1.20 + ( (unit - 100) * 2 );
        } else if(unit >= 300) {
            bill = 100 * 1.20 + 200 * 2 + ((unit-300) * 3);
        }

        System.out.print("Electricity Bill : " + bill);

    }

}
