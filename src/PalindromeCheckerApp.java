import java.util.Scanner;

// UC11: Encapsulated PalindromeChecker class
class PalindromeChecker {
    public boolean checkPalindrome(String str) {
        // Using two-pointer (any method)
        char[] chars = str.replaceAll("\\s", "").toLowerCase().toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker();
        if (checker.checkPalindrome(input)) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not a palindrome.");
        }
        sc.close();
    }
}








