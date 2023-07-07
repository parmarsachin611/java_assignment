import java.util.Scanner;

public class SimpleInterest {
    
    public static void main(String[] args) {
        
        // Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principal : ");
        double principal = in.nextDouble();
        System.out.print("Enter Rate : ");
        int rate = in.nextInt();
        System.out.print("Enter Time : ");
        int time = in.nextInt();
        in.close();

        double simple = (principal * rate * time) / 100;

        System.out.println("The Simple interest : "+simple);

    }

}

