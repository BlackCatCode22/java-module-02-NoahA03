import java.util.Scanner;

public class ReversedStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Type something: ");
        String text = scanner.nextLine();

        // Reverse the input
        StringBuilder reversedText = new StringBuilder(text).reverse();

        // Print the result
        System.out.println("Reversed: " + reversedText);

        scanner.close();
    }
}

