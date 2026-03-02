import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String original = sc.nextLine();

        // UC5: Stack implementation
        Stack<Character> stack = new Stack<>();

        // Push all characters
        for (char c : original.toCharArray()) {
            stack.push(c);
        }

        // Pop and build reversed
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        // Compare
        if (original.equals(reversed.toString())) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not a palindrome.");
        }
        sc.close();
    }
}


