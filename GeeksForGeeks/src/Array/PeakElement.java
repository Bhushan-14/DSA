package Array;

import java.util.Arrays;
import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int peakIndex = peakElement(arr, n);

        if (peakIndex != -1) {
            System.out.println("Peak Element found at index: " + peakIndex);
        } else {
            System.out.println("Peak Element not found!");
        }
    }

    public static int peakElement(int[] arr, int n) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])) {
                return mid;
            }
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
