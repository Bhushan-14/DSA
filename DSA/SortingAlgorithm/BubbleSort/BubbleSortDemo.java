package SortingAlgorithm.BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Entered array is: " + Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("Sorted(Bubble) array is: " + Arrays.toString(arr));
    }

    static void bubbleSort(int arr[]) {
        boolean swap;
        // Run the step n-1 times
        for (int i = 0; i < arr.length - 1; i++) {
            swap = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                // If no two elements were swapped in inner loop, the array is already sorted.
                break;
            }
        }
    }
}

/*
Sorting algorithm is sort array step by step.
Every step in sorting algorithm is differed bby each other.

Bubble sort:
    in this technique larger elements is present in last position of every array after every iteration.
    It means after every pass right side get sorted.
 */
