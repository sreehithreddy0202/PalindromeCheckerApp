import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine();

        // UC13: Compare all methods
        long start, end;

        // Method 1: String Reverse
        start = System.nanoTime();
        boolean result1 = isPalindromeStringReverse(input);
        end = System.nanoTime();
        System.out.printf("String Reverse: %b (%.2f ns)%n", result1, (end - start) / 1e6);

        // Method 2: Two Pointer
        start = System.nanoTime();
        boolean result2 = isPalindromeTwoPointer(input);
        end = System.nanoTime();
        System.out.printf("Two Pointer: %b (%.2f ns)%n", result2, (end - start) / 1e6);

        // Method 3: Stack
        start = System.nanoTime();
        boolean result3 = isPalindromeStack(input);
        end = System.nanoTime();
        System.out.printf("Stack: %b (%.2f ns)%n", result3, (end - start) / 1e6);

        sc.close();
    }

    static boolean isPalindromeStringReverse(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }

    static boolean isPalindromeTwoPointer(String str) {
        str = str.replaceAll("\\s", "").toLowerCase();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) return false;
        }
        return true;
    }

    static boolean isPalindromeStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) stack.push(c);
        for (char c : str.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}










