package Array;

import java.util.Scanner;

public class IndexDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in an array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int result = maxIndexDiff(a, n);
        System.out.println("Maximum Index Difference: " + result);
    }

    static int maxIndexDiff(int a[], int n) {
        int st = 0, end = n - 1;
        int diff = 0;

        while (st <= end) {
            if (a[st] <= a[end]) {
                diff = Math.max(diff, end - st);
                st++;
                end = n - 1;
            } else {
                end--;
            }
        }

        return diff;
    }
}
