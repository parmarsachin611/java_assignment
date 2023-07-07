import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        
        // Take 2 numbers as inputs and find their HCF and LCM
        int temp, temp1, temp2, num1, num2, hcf, lcm;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Num1 : ");
        num1 = in.nextInt();
        System.out.print("Enter Num2 : ");
        num2 = in.nextInt();

        temp1 = num1;
        temp2 = num2;
        
        while (temp2 !=  0) {
            
            temp = temp2;
            temp2 = temp1 % temp2;
            temp1 = temp;

        }

        hcf = temp1;
        lcm = (num1*num2)/hcf;

        System.out.println("HCF : "+hcf);
        System.out.println("LCM : "+lcm);

    }
}
