import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        
        System.out.println("Factorial of Number");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = in.nextInt(), f = 1;
        in.close();

        for (int i = num; i >= 1; i--) {
            
            f *= i;

        }

        System.out.println("Factorial of " + num + " : " + f);

    }

}