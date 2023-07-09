import java.util.Scanner;
public class CGPA {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Calculate Percentage to CGPA");
        
        System.out.print("Enter Number of Subject : ");
        int subject = in.nextInt();
        float grade = calGrade(subject);
        in.close();

        double cgpa = grade * 9.5 ;

        System.out.print("CGPA : " + cgpa);

    }

    static float calGrade(int s){

        float total = 0;
        for(int i = 0; i < s; i++){

            System.out.print("Enter " + s + " Subject : ");
            float mark = in.nextFloat;
            

        }


        return grade;

    }

}
