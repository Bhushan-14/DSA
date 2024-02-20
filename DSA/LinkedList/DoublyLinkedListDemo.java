package LinkedList;

import java.util.Scanner;

class Implementation {
    Node head;
    Node tail;

    static class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

        public Node(int val) {
            this.val = val;
        }
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;

        if (tail == null) {
            tail = head;
        }
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        newNode.prev = tail;
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;

        if (head == null) {
            head = tail;
        }
    }

    public void displayList() {
        Node current = head;
        System.out.println("Doubly Linked List:");
        while (current != null) {
            if (current.prev == null) {
                System.out.print("null <-> ");
            }

            System.out.print(current.val);

            if (current.next != null) {
                System.out.print(" <-> ");
            } else {
                System.out.print(" <-> null");
            }

            current = current.next;
        }
        System.out.println();
    }
}

public class DoublyLinkedListDemo {
    public static void main(String[] args) {
        Implementation implementation = new Implementation();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of the List: ");
        int n = sc.nextInt();

        System.out.println("Enter elements in the List: ");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            implementation.insertLast(element);
        }

        implementation.displayList();

        System.out.println("Enter element to insert in first: ");
        int element = sc.nextInt();
        implementation.insertFirst(element);

        implementation.displayList();
    }
}
