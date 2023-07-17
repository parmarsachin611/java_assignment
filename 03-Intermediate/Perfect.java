import java.util.Scanner;

public class Perfect {
    
    public static void main(String[] args) {
        
        System.out.println("Perfect Number In Java");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = in.nextInt();

        int sum = 0;

        for (int i = 1; i < num; i++) {
            
            if (num % i == 0) {
                sum += i;
            }

        }

        if (sum == num) {
            System.out.println(num + " is Perfect Number");
        } else {
            System.out.println(num + " is not Perfect Number");
        }

    }
    
}
