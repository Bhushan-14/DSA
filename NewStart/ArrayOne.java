/*
    Array :
    - A collection of data elements of the same type stored in contiguous memory locations.
    - It is denoted by square brackets ([]).
    - Elements are accessed using index.
    - Index starts from 0.
*/

import java.util.Arrays;
import java.util.Scanner;
public class ArrayOne{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n]; // Declaration and initialization of an array with n elements
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered array is: "+Arrays.toString(arr));

    }
}