import java.util.Scanner;

public class Palindrome {
    
    public static void main(String[] args) {
        
        // To find out whether the given String is Palindrome or not.

        Scanner in = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = in.nextLine();
        in.close();

        checkPalindrome(str);

    }

    static void checkPalindrome(String res) {

        int start = 0, end = res.length() - 1;

        while(start < end) {

            if ( res.charAt(start) != res.charAt(end) ) {
                
                System.out.println(res + " is not palindrome.");
                return;
            
            }

            start++;
            end--;

        }

        System.out.println(res + " is palindrome.");

    }

}
