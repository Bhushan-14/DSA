package SearchingAlgorithm.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the target element to search for: ");
        int target = scanner.nextInt();

        int ans = binarySearch(arr,target);
        if(ans != -1){
            System.out.println(target+" is found at "+ans+" position");
        }
        else {
            System.out.println("Elements is not found");
        }
    }
    //return the index
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        //find the middle element
        while( start <= end){
//            middle = (start + end) / 2;  // int has fixed size hence it might be possible start + end is exceed the range of int hence use

            int middle = start + ((end - start) / 2);
            //target element is less than middle element
            if(target < arr[middle]){
                end = middle - 1;
            }
            //target element is greater than middle element
            else if (target > arr[middle]) {
                start = middle + 1;
            }
            //target element is equal to middle element
            else {
                return middle;
            }
        }
        return -1;
    }
}
/*
- Binary Search is optimized way of search than Linear search means it reduce the no. of comparisons.
- It is use for sorted array.(means it array is in ascending or descending order).
Steps:
    - Find the middle element
    - If target element is greater that middle element then search in  lower bound and vice versa.(due to sorted array)
    - if middle element == target element then return position of middle element.

- If array size is odd(5) then middle elements is approximately lower element(2)
 */
/*
When to use binary search?
    - When sorted data is given then try to use binary search.
    - when we want particular answer then try use binary search.+a
 */