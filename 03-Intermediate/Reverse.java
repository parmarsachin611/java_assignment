import java.util.Scanner;

public class Reverse {
    
    public static void main(String[] args) {
        
        System.out.println("Reverse A String");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter String : ");
        String ans = in.next(), rev = "";
        char c;

        for (int i = 0; i < ans.length(); i++) {
            
            c = ans.charAt(i);
            rev = c+rev;

        }

        System.out.println("Reverse String : " + rev);

    }

}
