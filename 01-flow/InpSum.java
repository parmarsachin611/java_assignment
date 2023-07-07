import java.util.Scanner;

public class InpSum {
    public static void main(String[] args) {
        
        // Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all
        Scanner scanner = new Scanner(System.in);
        double totalSum = 0;

        while (true) {
            System.out.print("Enter a number (or 'x' to exit): ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("x")) {
                break;
            }

            try {
                double number = Double.parseDouble(userInput);
                totalSum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'x' to exit.");
            }
        }

        System.out.println("The sum of the entered numbers is: " + totalSum);
    }
}
