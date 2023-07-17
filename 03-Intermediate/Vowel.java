import java.util.Scanner;

public class Vowel {
    
    public static void main(String[] args) {
        
        System.out.println("Java Program Vowel Or Consonant");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Char : ");
        char c = in.next().charAt(0);

        switch (c) {
            
            case 'a' -> System.out.println(c + " is vowel");
            case 'i' -> System.out.println(c + " is vowel");
            case 'o' -> System.out.println(c + " is vowel");
            case 'u' -> System.out.println(c + " is vowel");
            case 'e' -> System.out.println(c + " is vowel");
            default -> System.out.println(c + " is constant");

        }

    }

}
