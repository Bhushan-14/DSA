package SortingAlgorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Given array is: " + Arrays.toString(arr));
        System.out.println("Array after Count Sort using Array: " + Arrays.toString(countSort(arr)));
        System.out.println("Array after Count Sort using Hashmap: " + Arrays.toString(countSortHash(arr)));
    }

    static int[] countSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        int[] countArray = new int[max + 1];
        for (int num : arr) {
            countArray[num]++;
        }
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (countArray[i] > 0) {
                arr[index] = i;
                index++;
                countArray[i]--;
            }
        }
        return arr;
    }
    static int[] countSortHash(int[] arr){
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int index = 0;
        for (int i = min; i < max; i++) {
            int count = map.getOrDefault(i,0);
            for (int j = 0; j < count; j++) {
                arr[index] = i;
                index++;
            }

        }
        return arr;
    }
}
