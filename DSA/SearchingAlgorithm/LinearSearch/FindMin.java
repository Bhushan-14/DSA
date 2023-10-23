package SearchingAlgorithm.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered Array is: " + Arrays.toString(arr));
        int ans = min(arr);
        if (ans != -1) {
            System.out.println("Minimum Element is " + arr[ans] + " which found at position " + ans);
        }
    }

    static int min(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array does not contain anything");
        }

        int minIndex = 0;
        for (int index = 1; index < arr.length; index++) {
            if (arr[index] < arr[minIndex]) {
                minIndex = index;
            }
        }
        return minIndex;
    }
}
