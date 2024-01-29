package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SingleNumberDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        System.out.println(Arrays.toString(arr));
        singleNumber(arr,n);
    }
    static void singleNumber(int arr[], int n){
        if (n == 0) {
            System.out.println("Array does not contain any element");
        } else if (n == 1) {
            System.out.println("Array has only one element. The single element is: " + arr[0]);
        } else{
            System.out.println("The single element(s) in the array is/are: ");

            for (int i = 0; i < n; i++) {
                int currentNumber = arr[i];
                boolean isUnique = true;

                for (int j = 0; j < n; j++) {
                    if (i != j && currentNumber == arr[j]) {
                        isUnique = false;
                        break;
                    }
                }
                if (isUnique) {
                    System.out.print(currentNumber + " ");
                }
            }
        }
    }
}
