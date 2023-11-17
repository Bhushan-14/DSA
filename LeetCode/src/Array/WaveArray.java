package Array;

import java.util.Arrays;
import java.util.Scanner;

public class WaveArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements in array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Entered Array is: ");
        System.out.println(Arrays.toString(arr));

        rearrangeArray(arr);
        System.out.println("Rearranged Array is: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void rearrangeArray(int[] arr) {
        for (int i = 0; i < arr.length; i = i + 2) {
            if (i > 0 && arr[i] < arr[i - 1]) {
                swap(arr, i, i - 1);
            }
            if (i < arr.length - 1 && arr[i] < arr[i + 1]) {
                swap(arr, i, i + 1);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
