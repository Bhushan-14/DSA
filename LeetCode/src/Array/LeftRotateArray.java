package Array;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateArray {
    public static void main(String[] args) {
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

        System.out.println("Enter a target element: ");
        int target = sc.nextInt();

        System.out.println("Left rotated array is: " + Arrays.toString(leftRotateArray(arr, target)));

    }
    public static int[] leftRotateArray(int[] arr, int target) {
        int n = arr.length;
        int[] rotatedArray = new int[n];

        for (int i = 0; i < n; i++) {
            //this expression treat array as circular array
            int newPosition = (i - target + n) % n;
            rotatedArray[newPosition] = arr[i];
        }
        return rotatedArray;
    }

}
