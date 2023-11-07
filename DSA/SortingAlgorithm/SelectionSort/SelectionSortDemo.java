package SortingAlgorithm.SelectionSort;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Entered Array are: " + Arrays.toString(arr));

        selectionSort(arr);
        System.out.println("Sorted(Selection) array is: " + Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Find the max element in the remaining array and swap with the correct index.
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);

            swapArray(arr, maxIndex, last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = 0; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swapArray(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

