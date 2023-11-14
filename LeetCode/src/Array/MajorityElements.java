package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MajorityElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Please enter a valid array size.");
            return;
        }
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered Array is: ");
        System.out.println(Arrays.toString(arr));

        int majorityElement = findMajorityElement(arr);

        if (majorityElement != -1) {
            System.out.println("Majority element is: " + majorityElement);
        } else {
            System.out.println("No majority element found.");
        }
    }

    // Function to find the majority element in the array
    public static int findMajorityElement(int[] arr) {
        int majorityElement = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            // Check if count is 0 and update the majorityElement
            if (count == 0) {
                majorityElement = num;
            }
            // Update the count based on whether num is the majorityElement
            if (majorityElement == num) {
                count += 1;
            } else {
                count -= 1;
            }
        }

        // Count occurrences of the potential majority element
        int countMajority = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == majorityElement) {
                countMajority++;
            }
        }

        // Check if the potential majority element is a majority
        if (countMajority > arr.length / 2) {
            return majorityElement;
        } else {
            return -1;  // No majority element found
        }
    }
}
