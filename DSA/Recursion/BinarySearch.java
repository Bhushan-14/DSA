package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
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
    }
    static int binarySearch(int arr[],int n){
        int start = 0;
        int end = n;
        if(n != 0){
        }
        return 1;
    }
}
