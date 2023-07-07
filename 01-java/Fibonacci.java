import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String[] args) {
        
        // To calculate Fibonacci Series up to n numbers.
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = in.nextInt();
        in.close();

        int a = 0, b = 1;

        System.out.print("Fibonacci series : " + a + " , " + b );

        int nextNum;
        int i = 2;
        do {
            
            nextNum = a + b;
            a = b;
            b = nextNum;
            System.out.print( " , " + nextNum );
            i++;
            
        } while (i < num);

    }

}
