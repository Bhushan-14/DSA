package SearchingAlgorithm.LinearSearch;

import java.util.Arrays;

public class SearchIndexIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12,34,55},
                {11,8,3,6},
                {56,32},
                {19 ,64,22,9}
        };
        int target = 32;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        for (int row = 0;row < arr.length;row++){
            for (int col = 0;col < arr[row].length;col++){
                if(arr[row][col] == target){
                    return new  int[]{row, col};
                }
            }
        }
        return new  int[]{-1,-1};
    }
}
