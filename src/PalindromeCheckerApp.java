import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String original = sc.nextLine();

        if (isPalindromeRecursive(original, 0, original.length() - 1)) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not a palindrome.");
        }
        sc.close();
    }

    // UC9: Recursive method
    public static boolean isPalindromeRecursive(String str, int left, int right) {
        // Base condition
        if (left >= right) {
            return true;
        }

        // Compare first & last chars
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        // Recursive call
        return isPalindromeRecursive(str, left + 1, right - 1);
    }
}






