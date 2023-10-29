package SearchingAlgorithm.BinarySearch;

import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
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

        int ans = orderAgnosticBinarySearch(arr,target);
        if(ans != -1){
            System.out.println(target+" is found at position: "+ans);
        }
        else {
            System.out.println("Elements is not found");
        }
    }
    static int orderAgnosticBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        //To check in which order array is sorted
        boolean isAsc;
        if (arr[start] < arr[end]) {
            isAsc = true;
            System.out.println("Entered Array is in Ascending order");
        }else {
            isAsc = false;
            System.out.println("Entered Array is in Descending order");
        }

        while( start <= end){
            int middle = start + ((end - start) / 2);
            if(target == arr[middle]){
                return middle;
            }
            if(isAsc){
                if(target < arr[middle]){
                    end = middle - 1;
                } else if (target > arr[middle]) {
                    start = middle + 1;
                }
            }
            else {
                if(target > arr[middle]){
                    end = middle - 1;
                } else if (target < arr[middle]) {
                    start = middle + 1;
                }
            }
        }
        return -1;
    }
}

/* to check array is sorted in ascending order or descending order:
    - if start element < end element : ascending order
    - else descending order
 */