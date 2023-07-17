import java.util.Scanner;

public class Sum {
    
    public static void main(String[] args) {
        
        System.out.println("Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.");
        Scanner in = new Scanner(System.in);
        int num, sumNeg = 0, sumEven = 0, sumOdd = 0;

        while(true) {
            
            System.out.print("Enter Number : ");
            num = in.nextInt();
            
            if (num < 0) {
                sumNeg += num;
            } else if(num == 0){
                break;
            }else if(num % 2 == 0) {
                sumEven += num;
            } else if(num % 2 != 0) {
                sumOdd += num;
            } 
            
            System.out.println("Sum of Negative Number : " + sumNeg);
            System.out.println("Sum of Even Number : " + sumEven);
            System.out.println("Sum of Odd Number : " + sumOdd);
        
        }

    }

}
