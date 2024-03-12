package BigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    static BigInteger fact(int num){
        BigInteger ans = new BigInteger("1");
        for (int i = 2; i <= num ; i++) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number for Factorial: ");
        int num = sc.nextInt();
        System.out.println(Factorial.fact(num));
    }
}
