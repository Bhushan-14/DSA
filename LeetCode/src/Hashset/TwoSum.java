package Hashset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("Enter target sum: ");
        int targetSum = sc.nextInt();

        List<int[]> result = findAllTwoSums(arr, targetSum);
        for (int[] pair : result) {
            System.out.println(Arrays.toString(pair));
        }
    }

    private static List<int[]> findAllTwoSums(int[] arr, int targetSum) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, Integer> numIndex = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int comp = targetSum - arr[i];
            if (numIndex.containsKey(comp)) {
                result.add(new int[]{arr[numIndex.get(comp)], arr[i]});
            }
            numIndex.put(arr[i], i);
        }
        return result;
    }
}
