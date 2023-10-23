package Array;

import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Customers (users): ");
        int n = sc.nextInt();

        int[][] acc = new int[n][];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number of accounts for User " + (i + 1) + ":");
            int numAccounts = sc.nextInt();
            acc[i] = new int[numAccounts];

            System.out.println("Enter account balances for User " + (i + 1) + ":");
            for (int j = 0; j < numAccounts; j++) {
                acc[i][j] = sc.nextInt();
            }
        }

        System.out.println("Account Details are: ");
        for (int i = 0; i < n; i++) {
            System.out.print("User " + (i + 1) + ": [");
            for (int j = 0; j < acc[i].length; j++) {
                System.out.print(acc[i][j]);
                if (j < acc[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }

        int[] richestUserAndBalance = findRichestUserAndBalance(acc);
        System.out.println("User with the highest balance is User " + (richestUserAndBalance[0] + 1));
        System.out.println("Maximum Balance is: " + richestUserAndBalance[1]);
    }

    // Method to find the user with the highest balance and their balance
    public static int[] findRichestUserAndBalance(int[][] acc) {
        int maxSum = 0;
        int richestUserIndex = 0;
        for (int i = 0; i < acc.length; i++) {
            int sum = 0;
            for (int j = 0; j < acc[i].length; j++) {
                sum += acc[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                richestUserIndex = i;
            }
        }
        int[] result = {richestUserIndex, maxSum};
        return result;
    }
}
