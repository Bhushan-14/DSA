package LinkedList;

import java.util.Scanner;

class Node {
    int val;
    Node1 next;

    Node(int val) {
        this.val = val;
    }
}

public class SwapNodesInPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the linked list: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements of the linked list:");
        Node1 head = createLinkedList(scanner, n);

        System.out.println("\nOriginal Linked List:");
        printLinkedList(head);

        Node1 result = swapPairs(head);

        System.out.println("\nLinked List after swapping pairs:");
        printLinkedList(result);

        scanner.close();
    }

    public static Node1 createLinkedList(Scanner scanner, int n) {
        Node1 dummy = new Node1(0);
        Node1 current = dummy;

        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            current.next = new Node1(val);
            current = current.next;
        }

        return dummy.next;
    }

    public static void printLinkedList(Node1 head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node1 swapPairs(Node1 head) {
        Node1 dummy = new Node1(0);
        dummy.next = head;

        Node1 prev = dummy;
        Node1 current = head;

        while (current != null && current.next != null) {
            Node1 first = current;
            Node1 second = current.next;

            prev.next = second;
            first.next = second.next;
            second.next = first;

            prev = first;
            current = first.next;
        }
        return dummy.next;
    }
}
