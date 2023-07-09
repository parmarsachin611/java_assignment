import java.util.Scanner;

public class SumInp {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int sum = 0, n;
        
        while (true) {
            
            System.out.print("Enter Num : ");
            n = in.nextInt();
            if (n == 0) {
                break;
            }

            sum += n;

        }

        System.out.println("Sum of all Number : " + sum);

    }

}
