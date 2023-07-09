import java.util.Scanner;

public class Addition {
    
    public static void main(String[] args) {
        
        System.out.println("Addition Of Two Numbers");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Num1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter Num2 : ");
        int num2 = in.nextInt();
        in.close();
        System.out.println("Addition : " + (num1+num2));

    }

}
