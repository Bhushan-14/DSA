package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        twoSum();
    }

    static void twoSum() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Entered Array is: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter target: ");
        int target = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Indices of the two numbers that add up to the target: [" + i + ", " + j + "]");
                    return;
                }
            }
        }

        System.out.println("No two elements in the array add up to the target.");
    }
}
