package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

class DequeImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> integerDeque = new ArrayDeque<>();
        integerDeque.add(15);
        integerDeque.add(16);
        System.out.println("Enter element in queue: ");
        for (int i = 0; i < 3; i++) {
            int element = sc.nextInt();
            integerDeque.addFirst(element);
        }
        System.out.println("Deque is: "+integerDeque);
        integerDeque.addFirst(12);
        integerDeque.addLast(24);
        System.out.println("Deque is: "+integerDeque);
        integerDeque.remove();
        System.out.println("Deque is: "+integerDeque);
    }
}
