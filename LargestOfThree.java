import java.util.Scanner;

public class LargestOfThree {

    // Method to find the largest of three numbers
    public static int findLargest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get three integers from the user
        System.out.print("Enter the first integer: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int b = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int c = scanner.nextInt();

        // Find and display the largest number
        int largest = findLargest(a, b, c);
        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}