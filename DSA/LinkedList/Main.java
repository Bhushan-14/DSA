package LinkedList;

import java.util.Scanner;

public class Main {
    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public Main() {
        this.size = 0;
    }

    public void addNode(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int data) {
        if (tail == null) {
            Node node = new Node(data);
            head = tail = node;
            size++;
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAfterElement(int data, int index) {
        if (index == 0) {
            addNode(data);
            return;
        }
        if (index == size) {
            insertLast(data);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(data, temp.next);
        temp.next = newNode;
        size++;
    }

    public int deleteLast() {
        if (size <= 1) {
            int data = head.value;
            head = tail = null;
            size = 0;
            return data;
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        int data = tail.value;
        temp.next = null;
        tail = temp;
        size--;
        return data;
    }

    public void sortList() {
        for (Node i = head; i != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {
                if (i.value > j.value) {
                    int temp = i.value;
                    i.value = j.value;
                    j.value = temp;
                }
            }
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main linkedList = new Main();
        System.out.println("Enter size of linked list: ");
        int n = sc.nextInt();

        System.out.println("Enter elements for the linked list: ");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            linkedList.addNode(element);
        }

        System.out.println("Enter item to insert at last of linked list: ");
        int element = sc.nextInt();
        linkedList.insertLast(element);

        System.out.println("Enter item to insert after index: ");
        int element1 = sc.nextInt();
        System.out.println("Enter index: ");
        int index = sc.nextInt();
        linkedList.insertAfterElement(element1, index);

        System.out.println("Entered list: ");
        linkedList.printList();

        int deletedValue = linkedList.deleteLast();
        System.out.println("Deleted last element: " + deletedValue);

        System.out.println("Entered list: ");
        linkedList.printList();
    }
}
