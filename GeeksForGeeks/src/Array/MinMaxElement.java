package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Minimum Element: "+arr[0]+"\nMaximum Element: "+arr[n-1]);
    }
}
