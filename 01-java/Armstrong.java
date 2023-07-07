import java.util.Scanner;

public class Armstrong {
    
    public static void main(String[] args) {
        
        // To find Armstrong Number between two given number.

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter Number2 : ");
        int num2 = in.nextInt();
        in.close();

        for (int i = num1; i <= num2; i++) {
            
            int check = i, sum = 0, rem;

            while (check != 0) {
                
                rem = check % 10;
                sum = sum + (rem*rem*rem);
                check = check / 10;

            }

            if (sum == i) {
                
                System.out.println(i + " is Armstrong Number");

            }

        }

    }

}
