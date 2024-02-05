package LinkedList;

import java.util.Scanner;

public class RemoveDuplicate {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();

        System.out.println("Enter the number of elements in the linked list:");
        int n = sc.nextInt();

        ListNode head = null;
        ListNode tail = null;

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter element %d: ", i + 1);
            int element = sc.nextInt();

            ListNode newNode = new ListNode(element);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.println("Original Linked List:");
        printLinkedList(head);

        RemoveDuplicate resultRemover = new RemoveDuplicate();
        ListNode result = resultRemover.deleteDuplicates(head);

        System.out.println("Linked List after removing duplicates:");
        printLinkedList(result);
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
