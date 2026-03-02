import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        // Check palindrome using if-else
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }

        // Close scanner
        scanner.close();
    }

}
