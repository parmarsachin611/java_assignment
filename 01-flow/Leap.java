import java.util.Scanner;

public class Leap{
    public static void main(String[] args) {
        // Input a year and find whether it is a leap year or not
        int year;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Year: ");
        year = in.nextInt();

        if ( year % 400 == 0 || year % 4 == 0 && year % 100 != 0 ) {
            System.out.println(year +" is leap year.");
        } else {
            System.out.println(year + " is not leap year.");
        }

    }
}