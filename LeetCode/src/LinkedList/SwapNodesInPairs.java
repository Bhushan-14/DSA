package LinkedList;

import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class SwapNodesInPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the linked list: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements of the linked list:");
        ListNode head = createLinkedList(scanner, n);

        System.out.println("\nOriginal Linked List:");
        printLinkedList(head);

        ListNode result = swapPairs(head);

        System.out.println("\nLinked List after swapping pairs:");
        printLinkedList(result);

        scanner.close();
    }

    public static ListNode createLinkedList(Scanner scanner, int n) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next;
    }

    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode current = head;

        while (current != null && current.next != null) {
            ListNode first = current;
            ListNode second = current.next;

            prev.next = second;
            first.next = second.next;
            second.next = first;

            prev = first;
            current = first.next;
        }
        return dummy.next;
    }
}
