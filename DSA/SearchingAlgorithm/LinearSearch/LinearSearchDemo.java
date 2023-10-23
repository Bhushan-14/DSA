package SearchingAlgorithm.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of elements in Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements are: " + Arrays.toString(arr));

        System.out.println("Enter target element");
        int target = sc.nextInt();

        int index = linearSearch(arr, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at position " + index);
        } else {
            System.out.println("Element " + target + " is not present in the array");
        }
    }

    // Linear Search
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            System.out.println("Array does not contain anything");
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
}
