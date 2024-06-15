package Array;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSumHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the target sum: ");
        int target = sc.nextInt();

        TwoSumHashMap twoSumHashMap = new TwoSumHashMap();
        int[] indices = twoSumHashMap.twoSum(nums, target);

        if (indices.length == 2) {
            System.out.println("Indices: " + indices[0] + ", " + indices[1]);
        } else {
            System.out.println("No indices found.");
        }
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
