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

        System.out.print("CGPA : " + grade);
        System.out.print("Percent : " + grade);

    }

    static float calGrade(int s){

        int total = 0;
        float grade = 0;
        for(int i = 0; i < s; i++){

            System.out.print("Enter " + i + " Subject : ");
            int mark = in.nextInt();
            
            if (mark >= 91 && mark <= 100) {
                total = total + 10;
            } else if(mark >= 81 && mark <= 90) {
                total = total + 9;
            } else if(mark >= 71 && mark <= 80) {
                total = total + 8;
            } else if(mark >= 61 && mark <= 70) {
                total = total + 7;
            } else if(mark >= 51 && mark <= 60) {
                total = total + 6;
            } else if(mark >= 41 && mark <= 50) {
                total = total + 5;
            } else if(mark >= 33 && mark <= 40) {
                total = total + 4;
            } else if(mark >= 21 && mark <= 33) {
                total = total + 0;
            } else if(mark >= 0 && mark <= 20) {
                total = total + 0;
            }

        }

        grade = total/s;

        return grade;

    }

}
