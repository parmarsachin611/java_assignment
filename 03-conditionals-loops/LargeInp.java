import java.util.Scanner;

public class LargeInp {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int large = 0, n;
        
        while (true) {
            
            System.out.print("Enter Num : ");
            n = in.nextInt();
            if (n == 0) {
                break;
            }

            if (large < n) {
                large = n;
            }

        }
        
        System.out.println("Largest of all Number : " + large);

    }

}
