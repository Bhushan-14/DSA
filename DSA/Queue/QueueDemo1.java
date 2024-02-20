package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        System.out.println("Enter element in queue: ");
        for (int i = 0; i < 3; i++) {
            int element = sc.nextInt();
            queue.add(element);
        }
        System.out.println("Entered queue is: "+queue);
        System.out.println(queue.peek());
        System.out.println("Entered queue is: "+queue);
        System.out.println(queue.remove());
        System.out.println("Entered queue is: "+queue);
    }
}
