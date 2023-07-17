import java.util.Scanner;

public class LeapYear {
    
    public static void main(String[] args) {
        
        System.out.println("Check Leap Year Or Not");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int year = in.nextInt();

        if ( year % 400 == 0 || year % 4 == 0 && year % 100 != 0 ) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not leap year");
        }

    }

}
