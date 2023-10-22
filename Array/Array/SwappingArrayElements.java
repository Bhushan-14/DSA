package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SwappingArrayElements {
    public static void main(String[] args) {
        swap();
    }

    static void swap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Array elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "+n+" array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter index no.1 for swapping: ");
        int index1 = sc.nextInt();
        System.out.println("Enter index no.2 for swapping: ");
        int index2 = sc.nextInt();

        if (index1 >= 0 && index1 < n && index2 >= 0 && index2 < n) {

            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;

            System.out.println("Array after swapping is: ");
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("Invalid indices for swapping. Please enter valid indices within the array size.");
        }
    }
}
