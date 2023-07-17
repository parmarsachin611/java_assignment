import java.util.Scanner;

public class Vote {
    
    public static void main(String[] args) {
        
        System.out.println("A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Age : ");
        int age = in.nextInt();

        checkEligibility(age);

    }

    static void checkEligibility(int n) {
        if (n >= 18) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("Not Eligible to Vote");
        }
    }

}
