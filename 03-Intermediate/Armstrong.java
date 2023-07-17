import java.util.Scanner;

public class Armstrong {
    
    public static void main(String[] args) {
        
        System.out.println("Armstrong Number");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = in.nextInt();
        int total = 0;
        int n = number;
        while (n > 0) {
            int rem = n % 10;
            total = total + (rem * rem * rem);
            n = n / 10;
        }

        String ans = (number == total) ? " is Armstrong Number" : " is Not Armstrong Number";
        System.out.println(number + ans);

    }

}
