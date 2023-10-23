package SearchingAlgorithm.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchDemo {
    public static void main(String[] args){
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

    }

}
