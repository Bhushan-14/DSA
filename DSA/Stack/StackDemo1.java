package Stack;

import java.util.Scanner;
import java.util.Stack;
public class StackDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int numberOfElements = scanner.nextInt();
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            String element = scanner.next();
            stack.push(element);
        }
        System.out.println("Elements in the stack: " + stack);
        for (int i = 0; i < numberOfElements; i++) {
            stack.pop();
            System.out.println("Elements in the stack after popping: " + stack);
        }

        scanner.close();
    }
}
