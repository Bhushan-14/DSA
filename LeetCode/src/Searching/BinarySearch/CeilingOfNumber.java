package Searching.BinarySearch;

import java.util.Scanner;

public class CeilingOfNumber {
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

        int ans = cieling(arr,target);

        System.out.println("Ceiling number is "+arr[ans]+" for target "+target+" is found at "+ans);

    }

    //return the smallest number which is greater than target element(Ceiling number)
    static int cieling(int[] arr, int target){
        //if target element is the greatest element in array then
        if(target > arr[arr.length - 1]){
            return -1;
        }
        //if target is the smallest number in array
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int middle = start + ((end - start) / 2);

           if(target < arr[middle]){
                end = middle - 1;
            }
            else if (target > arr[middle]){
                start = middle + 1;
            }
            else{
                return middle;
            }
        }
        return start;
    }
}
/*
Ceiling = the smallest number in array greater or equal to target

    arr = {2, 3, 5, 9, 14, 16, 18}
    Ceiling(arr, target = 14) = 14
    Ceiling(arr, target = 15) = 16
    Ceiling(arr, target =  4) = 5
    Ceiling(arr, target =  9) = 9
 */