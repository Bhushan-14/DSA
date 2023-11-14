package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroToEnd {
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

        moveZeroToEnd(arr);

        System.out.println("Array after moving zero's to left: " + Arrays.toString(arr));
    }

//    To achieve the desired output, swapping the non-zero elements with the leftmost zero in the array results in the correct arrangemen
    public static void moveZeroToEnd(int[] arr) {
        int n = arr.length;
        int non_zero_index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[non_zero_index];
                arr[non_zero_index] = arr[i];
                arr[i] = temp;
                non_zero_index = non_zero_index + 1;
            }
        }
    }
}
