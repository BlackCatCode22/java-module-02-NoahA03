import java.util.Scanner;

public class MadnessWithMethods {
    public static void main(String[] args) {

        // Get two integers from the user
        int firstNumber = getIntFromUser("Enter the first integer: ");
        int secondNumber = getIntFromUser("Enter the second integer: ");


        // Compare the two integers
        compareIntegers(firstNumber, secondNumber);


        // Calculate and display the sum
        System.out.println("The sum of the two integers is: " + sumIntegers(firstNumber, secondNumber));
    }

    // Method to get an integer input from the user
    private static int getIntFromUser(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        int number = scanner.nextInt();
        return number;
    }

    // Method to compare two integers and print the result
    private static void compareIntegers(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a < b) {
            System.out.println(a + " is less than " + b);
        } else {
            System.out.println(a + " is equal to " + b);
        }
    }

    // Method to return the sum of two integers
    private static int sumIntegers(int a, int b) {
        return a + b;
    }
}