package SortingAlgorithm.BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter limit of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Array elements are: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Entered array is: "+Arrays.toString(arr));

        System.out.printf("Sorted array is: ");
        bubbleSort(arr);
    }
    static void bubbleSort(int arr[]){
        boolean swap;
        //run the step n-1 times
        for(int i = 0; i < arr.length; i++){
            swap = false;
            for( int j = 1; j < arr.length - i; j++){
                if (arr[i] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap = true;
                }
            }
            if(!swap){
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
