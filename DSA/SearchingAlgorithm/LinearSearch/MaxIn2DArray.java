package SearchingAlgorithm.LinearSearch;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 34, 55},
                {11, 8, 3, 6},
                {56, 32},
                {19, 64, 22, 9}
        };
        int[] result = search(arr);
        System.out.println("Maximum element: " + result[0]);
        System.out.println("Row: " + result[1]);
        System.out.println("Column: " + result[2]);
    }

    static int[] search(int[][] arr) {
        int max = Integer.MIN_VALUE;
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        int[] result = {max, maxRow, maxCol};
        return result;
    }
}
