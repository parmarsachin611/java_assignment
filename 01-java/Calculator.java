import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        
        // Take in two numbers and an operator (+, -, *, /) and calculate the value.

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter Number2 : ");
        int num2 = in.nextInt();
        System.out.print("Enter Operator(+, -, *, /) : ");
        char op = in.next().charAt(0);
        in.close();

        solve( num1, num2, op);

    }

    static void solve( int n1, int n2, char op ) {

        int ans = 0;

        if (op == '+') {
            ans  = n1 + n2;
        } else if(op == '/') {
            ans  = n1 / n2;
        } else if(op == '*') {
            ans  = n1 * n2;
        } else if(op == '-') {
            ans  = n1 - n2;
        } else {
            System.out.println("Invalid Output");
            return;
        }

        System.out.println("Answer : "+ ans);

    }

}
