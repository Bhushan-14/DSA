package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        System.out.println(Arrays.toString(arr));
        secondLargest(arr, n);
    }

    static void secondLargest(int arr[], int n) {
        int first, second;
        first = second = Integer.MIN_VALUE;

        if (n == 0) {
            System.out.println("Array does not contain any element");
        } else if (n == 1) {
            System.out.println("Array has only one element. The largest element is: " + arr[0]);
        } else {
            for (int i = 0; i < n; i++) {
                if (arr[i] > first) {
                    second = first;
                    first = arr[i];
                } else if (arr[i] > second && arr[i] != first) {
                    second = arr[i];
                }
            }
            System.out.println("Largest element is: " + first);
            if (second == Integer.MIN_VALUE) {
                System.out.println("Second largest element does not exist");
            } else {
                System.out.println("Second Largest element is: " + second);
            }
        }
    }
}
