import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many lines you want to print: ");
        int n = sc.nextInt();
        System.out.println("Enter the starting number you want to print: ");
        int t = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(t + "");
                t++;
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(t - 2 + "");
                t--;
            }
            System.out.println();
        }
    }
}
