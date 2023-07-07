import java.util.Scanner;

public class Largest {
    
    public static void main(String[] args) {

        // Take 2 numbers as input and print the largest number.
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter Number2 : ");
        int num2 = in.nextInt();
        in.close();

        if (num1 == num2) {
            System.out.println("Both are equals");
        } else {
            int largest = (num1 > num2) ? num1 : num2;
            System.out.println("Largest Number : " + largest);   
        }

    }
    
}
