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

        // Build linked list (head insertion)
        ListNode head = null;
        for (char c : original.toCharArray()) {
            ListNode newNode = new ListNode(c);
            newNode.next = head;
            head = newNode;
        }

        if (isPalindrome(head)) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not a palindrome.");
        }
        sc.close();
    }

    // UC8: Fast-slow pointer + reverse second half
    static boolean isPalindrome(ListNode head) {
        // Step 1: Find middle (fast-slow pointers)
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        ListNode secondHalf = reverseList(slow);

        // Step 3: Compare first half vs reversed second half
        ListNode firstHalf = head;
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    // Reverse linked list (second half)
    static ListNode reverseList(ListNode head) {
        ListNode prev = null, current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}






