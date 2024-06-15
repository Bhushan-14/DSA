package LinkedList;

import java.util.Scanner;

class Node1 {
    int val;
    Node1 next;

    public Node1(int val) {
        this.val = val;
    }

    public Node1(int val, Node1 next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeTwoSortedLL {
    public Node1 createLinkedList() {
        Scanner sc = new Scanner(System.in);
        Node1 head = null;
        Node1 tail = null;
        System.out.println("Enter size of list: ");
        int n = sc.nextInt();
        if (n != 0) {
            System.out.println("Enter elements in list: ");
        }
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            Node1 newNode = new Node1(element);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    public Node1 mergeTwoLists(Node1 list1, Node1 list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        Node1 dummy = new Node1(0);
        Node1 current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }

    public void printList(Node1 head) {
        Node1 current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeTwoSortedLL merger = new MergeTwoSortedLL();
        System.out.println("Enter elements for first sorted list: ");
        Node1 list1 = merger.createLinkedList();
        System.out.println("Enter elements for second sorted list: ");
        Node1 list2 = merger.createLinkedList();

        Node1 mergedList = merger.mergeTwoLists(list1, list2);

        System.out.println("Merged list is: ");
        merger.printList(mergedList);
    }
}
