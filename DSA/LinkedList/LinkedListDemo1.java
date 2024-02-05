package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of elements in array: ");
        int n = sc.nextInt();

        LinkedList<Integer> l1 = new LinkedList<>();
        System.out.println("Enter elements in an array: ");

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            l1.add(data);
        }

        System.out.println("Linked List: " + l1);
    }
}
