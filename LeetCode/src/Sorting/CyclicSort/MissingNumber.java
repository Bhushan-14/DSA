package Sorting.CyclicSort;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Entered array is: " + Arrays.toString(arr));

        int missing = missingNumber(arr);
        System.out.println("Missing number is: " + missing);
    }

    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct_index = arr[i] - 1;
            if (arr[i] >= 0 && arr[i] < arr.length && arr[i] != arr[correct_index]) {
                swap(arr, i, correct_index);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return j + 1;
            }
        }
        return arr.length + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}


//    Enter the size of the array:
//        2
//        Enter array elements:
//        0
//        1
//        Entered array is: [0, 1]
//        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 2
//        at Sorting.CyclicSort.MissingNumber.missingNumber(MissingNumber.java:30)
//        at Sorting.CyclicSort.MissingNumber.main(MissingNumber.java:22)
//for this problem we have following solution:

//public class MissingNumber {
//    public int missingNumber(int[] nums) {
//        int n = nums.length;
//        int expectedSum = n * (n + 1) / 2;
//        int actualSum = 0;
//
//        for (int num : nums) {
//            actualSum += num;
//        }
//
//        return expectedSum - actualSum;
//    }
//}
