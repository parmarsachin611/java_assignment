import java.util.Scanner;

public class Greeting {
    
    public static void main(String[] args) {

        // Take name as input and print a greeting message for that particular name

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = in.next();
        in.close();

        System.out.println("Hello, " + name);

    }

}
