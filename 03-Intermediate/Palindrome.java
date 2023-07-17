import java.util.Scanner;

public class Palindrome {
    
    public static void main(String[] args) {
        
        System.out.println("Find if a number is palindrome or not");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = in.nextInt(), rev = 0, rem, n;
        n = num;

        while (n > 0) {
            
            rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;

        }

        if (num == rev) {
            System.out.println(num + " is palindrome number");
        } else {
            System.out.println(num + " is not palindrome number");
        }

    }

}
