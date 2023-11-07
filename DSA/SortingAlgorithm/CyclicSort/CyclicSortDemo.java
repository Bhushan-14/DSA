package SortingAlgorithm.CyclicSort;

import java.util.Arrays;
import java.util.Scanner;

public class CyclicSortDemo {
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

        cycleSort(arr);

        System.out.println("Sorted(Cyclic) array is: " + Arrays.toString(arr));

    }
    static void cycleSort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct_index = arr[i] - 1;
            if(arr[i] != arr[correct_index]){
                swap(arr, i, correct_index);
            } else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
/*
Time Complexity of selection, insertion and bubble sort inO(n^2).
while complexity od cyclic sort is O(n).
 */





