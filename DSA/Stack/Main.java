package Stack;

import java.util.Scanner;

public class Main {
    static class Stack {
        private int maxSize;
        private int[] stackArray;
        private int top;

        public Stack(int size) {
            maxSize = size;
            stackArray = new int[maxSize];
            top = -1;
        }

        public void push(int value) {
            if (top < maxSize - 1) {
                stackArray[++top] = value;
                System.out.println("Pushed " + value + " onto the stack");
            } else {
                System.out.println("Stack overflow! Cannot push " + value);
            }
        }

        public int pop() {
            if (top >= 0) {
                int poppedValue = stackArray[top--];
                System.out.println("Popped " + poppedValue + " from the stack");
                return poppedValue;
            } else {
                System.out.println("Stack underflow! Cannot pop from an empty stack");
                return -1;
            }
        }

        public int isEmpty(){
            return top = -1;
        }
        public boolean isFull() {
            return top == maxSize - 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the stack: ");
        int stackSize = scanner.nextInt();
        Stack stack = new Stack(stackSize);

        while (true) {
            System.out.print("Enter a value to push onto the stack (or enter -1 to pop, or enter -2 to exit): ");
            int value = scanner.nextInt();

            if (value == -2) {
                break;
            } else if (value == -1) {
                stack.pop();
            } else {
                stack.push(value);
            }
        }
        scanner.close();
    }
}
