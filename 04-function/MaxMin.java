import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {
        
        System.out.println("Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st Num : ");
        int n1 = in.nextInt();
        System.out.print("Enter 2nd Num : ");
        int n2 = in.nextInt();
        System.out.print("Enter 3rt Num : ");
        int n3 = in.nextInt();

        maxNum(n1,n2,n3);
        minNum(n1,n2,n3);

    }

    static void maxNum(int num1, int num2, int num3) {

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is largest number.");
        } else if(num2 > num1 && num2 > num3){
            System.out.println(num2 + " is largest number.");
        } else {
            System.out.println(num3 + " is largest number.");
        }

    }

    static void minNum(int num1, int num2, int num3) {

        if (num1 < num2 && num1 < num3) {
            System.out.println(num1 + " is smallest number.");
        } else if(num2 < num1 && num2 < num3){
            System.out.println(num2 + " is smallest number.");
        } else {
            System.out.println(num3 + " is smallest number.");
        }

    }

}