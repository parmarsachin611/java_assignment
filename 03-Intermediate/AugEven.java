import java.util.Scanner;

public class AugEven {
    
    public static void main(String[] args) {
        
        System.out.println("Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.");
        System.out.println("Total Number of days in August : 31");
        int num = 31, day = 0;
        
        for (int i = 1; i <= num; i++) {
            if ( i % 2 == 0 ) {
                day++;
            }
        }

        System.out.println("Total Number of days that kunal can go out in the month of August : " + day);

    }

}
