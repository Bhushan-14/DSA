package Stack;

import java.util.Scanner;
import java.util.Stack;
public class StackDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter element in stack(Push operation): ");
        for (int i = 0; i < 5; i++) {
            int element = sc.nextInt();
            stack.push(element);
        }
        System.out.println(stack);
        System.out.println("Pop operation: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(stack.pop());
        }
    }
}
