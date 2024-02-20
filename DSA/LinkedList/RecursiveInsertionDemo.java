package LinkedList;

import java.util.Scanner;

class LinkedList {
    private Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertRecursively(int data, int index) {
        head = insertRecursivelyHelper(head, data, index);
    }

    private Node insertRecursivelyHelper(Node current, int data, int index) {
        if (index == 0) {
            Node newNode = new Node(data);
            newNode.next = current;
            return newNode;
        }

        if (current == null) {
            System.out.println("Invalid index. Cannot insert at index " + index);
            return null;
        }

        current.next = insertRecursivelyHelper(current.next, data, index - 1);
        return current;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class RecursiveInsertionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();

        linkedList.insertRecursively(10, 0);
        linkedList.insertRecursively(20, 1);
        linkedList.insertRecursively(30, 1);
        System.out.print("Linked List: ");
        linkedList.display();
    }
}
