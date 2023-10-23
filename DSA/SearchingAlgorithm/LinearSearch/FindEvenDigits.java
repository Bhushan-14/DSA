package SearchingAlgorithm.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class FindEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of elements in Array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Array Elements are: " + Arrays.toString(nums));
        int evenCount = findNumbers(nums);
        System.out.println("Even number of digits present in : " + evenCount + " numbers");

        System.out.println("Those numbers are:");
        printNumbersWithEvenDigits(nums);
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int number_of_digits = digits(num);
        return number_of_digits % 2 == 0;
    }

    // Count digits in number
    static int digits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    // Print numbers with even digits
    static void printNumbersWithEvenDigits(int[] nums) {
        for (int num : nums) {
            if (even(num)) {
                System.out.println(num);
            }
        }
    }
}
