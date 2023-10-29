package BinarySearch;

import java.util.Scanner;

public class FindPeakElement {
    public static void findPeakElements(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if ((i == 0 || nums[i] > nums[i - 1]) &&
                    (i == nums.length - 1 || nums[i] > nums[i + 1])) {
                System.out.println("Peak element at index " + i + ": " + nums[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Peak elements in the input array:");
        findPeakElements(nums);

        scanner.close();
    }
}
