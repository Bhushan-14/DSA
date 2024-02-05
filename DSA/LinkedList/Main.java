package LinkedList;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int d) {
        data = d;
        next = null;
    }
}

class MyLinkedList {
    Node head;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int numElements = sc.nextInt();
        
        MyLinkedList myLinkedList = new MyLinkedList();

        for (int i = 0; i < numElements; i++) {
            System.out.println("Enter data for element " + (i + 1) + ": ");
            int data = sc.nextInt();
            myLinkedList.addNode(data);
        }

        System.out.println("All elements in the linked list:");
        myLinkedList.printList();
    }
}
