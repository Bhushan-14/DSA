package Searching.BinarySearch;

import java.util.Scanner;

public class FloorNumber {
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

        int ans = Floor(arr,target);

        System.out.println("Floor number is "+arr[ans]+" for target "+target+" is found at "+ans);

    }

    //return the smallest number which is greater than target element(Ceiling number)
    static int Floor(int[] arr, int target){
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
        return end;
    }
}

/*
 floor = the greatest element which smaller or equal to target element

    arr = {2, 3, 5, 9, 14, 16, 18}
    Floor(arr, target = 14) = 14
    Floor(arr, target = 15) = 14
    Floor(arr, target =  4) = 3
    Floor(arr, target =  9) = 9
 */