package Stack;

import java.util.Scanner;

class StackImplementation{
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    public StackImplementation(){
        this(DEFAULT_SIZE);
    }
    public StackImplementation(int size) {
        this.data = new int[size];
    }
    int ptr = -1;
    public boolean insertElement(int item){
        if(isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Can not pop from empty stack");
        }
        int removed = data[ptr];
        ptr--;
        return removed;

    }
    public int peek()throws Exception {
        if(isEmpty()){
            throw new Exception("Can not peek from empty stack");
        }
        return data[ptr];
    }
    public boolean isFull() {
        return ptr == data.length - 1;
    }
    public boolean isEmpty() {
        return ptr == -1;
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackImplementation stackImplementation = new StackImplementation();
        int choice;
        do {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of elements to push: ");
                    int numElementsToPush = sc.nextInt();
                    System.out.print("Enter elements to push: ");
                    for (int i = 0; i < numElementsToPush; i++) {
                        int elementToPush = sc.nextInt();
                        stackImplementation.insertElement(elementToPush);
                    }
                    break;

                case 2:
                    try {
                        int poppedElement = stackImplementation.pop();
                        System.out.println("Popped element: " + poppedElement);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        int peekedElement = stackImplementation.peek();
                        System.out.println("Peeked element: " + peekedElement);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose again.");
            }

        } while (choice != 4);
    }
}