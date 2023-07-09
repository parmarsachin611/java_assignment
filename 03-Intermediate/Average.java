import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        
        System.out.println("Average of N Number");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 'N' : ");
        int n = in.nextInt(), sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter " + i + " Number : ");
            int num = in.nextInt();
            sum += num;
        }
        in.close();

        double average = (sum/n);
        System.out.println("Average Number : " + average);

    }

}