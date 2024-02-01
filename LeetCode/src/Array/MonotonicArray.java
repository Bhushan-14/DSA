package Array;

import java.util.Scanner;

public class MonotonicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean result = isMonotonic(arr);
        if (result) {
            System.out.println("Given array is Monotonic");
        } else {
            System.out.println("Given array is not Monotonic");
        }
    }

    public static boolean isMonotonic(int[] arr) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                decreasing = false;
            } else if (arr[i] > arr[i + 1]) {
                increasing = false;
            }
        }
        return increasing || decreasing;
    }
}
