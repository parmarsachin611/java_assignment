import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        
        // Take a number as input and print the multiplication table for it
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = in.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " * " + i +" = " + num * i);
            i++;
        }

    }
}
