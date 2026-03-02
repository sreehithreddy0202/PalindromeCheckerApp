import java.util.Scanner;

class ListNode {
    char data;
    ListNode next;
    ListNode(char data) { this.data = data; }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String original = sc.nextLine();

        // Build linked list
        ListNode head = null;
        for (char c : original.toCharArray()) {
            ListNode newNode = new ListNode(c);
            newNode.next = head;
            head = newNode;
        }

        // Check palindrome (simplified)
        StringBuilder reversed = new StringBuilder();
        ListNode temp = head;
        while (temp != null) {
            reversed.append(temp.data);
            temp = temp.next;
        }

        if (original.equals(reversed.reverse().toString())) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not a palindrome.");
        }
        sc.close();
    }
}





