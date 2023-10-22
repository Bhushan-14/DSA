package Array;

import java.util.Scanner;

public class PlusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] digits = new int[n];
        System.out.println("Enter the elements in array: :");
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }

        PlusOne plusOne = new PlusOne();
        int[] result = plusOne.plusOne(digits);

        System.out.println("Resulting array is:");
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }

    public int[] plusOne(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }

        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
