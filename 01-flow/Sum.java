import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        
        // Take two numbers and print the sum of both
        int sum, num1, num2;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Num1 : ");
        num1 = in.nextInt();
        
        System.out.print("Enter Num2 : ");
        num2 = in.nextInt();

        sum = num1 + num2;

        System.out.println("Sum : "+sum);

    }
}
