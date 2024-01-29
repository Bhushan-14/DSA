package Array;

import java.util.Arrays;
import java.util.Scanner;

public class printLargestThreeDemo {
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

        printLargestThree(arr,n);
    }

    static void printLargestThree(int[] arr, int n){
        if(n < 3){
            System.out.println("Enter valid input");
        }
        int i, first, second, third;
        first = second = third = Integer.MIN_VALUE;
        for (i = 0;i < n;i++){
            if(arr[i] > first){
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            }else if (arr[i] > third){
                third = arr[i];
            }
        }
        System.out.println("Three largest element of an array are: "+first+" "+second+" "+third);
    }
}
