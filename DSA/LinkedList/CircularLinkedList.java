package LinkedList;

import java.util.Scanner;

class Implementation1 {
    private Node head;
    private Node tail;

    public Implementation1() {
        this.head = null;
        this.tail = null;
    }

    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public void addNode(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.val + "->");
                node = node.next;
            } while (node != null && node != head);

            // Print head element again to show circularity
            System.out.print(head.val);
            System.out.println();
        } else {
            System.out.println("Element does not found in list");
        }
    }

    public void deleteElement(int data) {
        Node current = head;

        if (current == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        do {
            if (current.val == data) {
                if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else {
                    Node temp = head;
                    while (temp.next != current) {
                        temp = temp.next;
                    }
                    temp.next = current.next;

                    if (current == tail) {
                        tail = temp;
                    }
                }

                System.out.println("Element " + data + " deleted from the list.");
                return;
            }

            current = current.next;

        } while (current != null && current != head);

        System.out.println("Element " + data + " not found in the list.");
    }
}

public class CircularLinkedList {
    public static void main(String[] args) {
        Implementation1 implementation1 = new Implementation1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of circular linked list: ");
        int n = sc.nextInt();
        System.out.println("Enter element: ");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            implementation1.addNode(element);
        }
        System.out.println("Entered circular Linked List is: ");
        implementation1.display();
        System.out.println("Enter element to delete from circular linked list: ");
        int element = sc.nextInt();
        implementation1.deleteElement(element);
        System.out.println("Circular Linked List after deletion: ");
        implementation1.display();
    }
}
