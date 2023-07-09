import java.util.Scanner;
public class Batting {
    
    public static void main(String[] args) {
        
        System.out.println("Calculate Batting Average");
        Scanner in = new Scanner(System.in);
        System.out.print("Total Run : ");
        int run = in.nextInt();
        System.out.print("Total innings : ");
        int match = in.nextInt();
        System.out.print("Number of not-out's : ");
        int not = in.nextInt();
        in.close();

        int innings = match - not;
        double average = run / innings;
        System.out.print("Batting Average : " + average);

    }

}
