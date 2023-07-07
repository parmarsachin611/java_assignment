import java.util.*;

public class EvenOrOdd{

    public static void main(String[] args) {
        
        // Write a program to print whether a number is even or odd, also take input from the user.

        Scanner in = new Scanner(System.in);
        System.out.print("Enter NUmber : ");
        int num = in.nextInt();
        in.close();

        String str = (num % 2 == 0) ? "Even Number" : "Odd Number";
        System.out.println(num + " is "+ str);

    }

}