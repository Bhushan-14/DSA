package BigInteger;

import java.math.BigInteger;

public class BigIntgerDemo {
    public static void main(String[] args) {
        int a = 37;
        int b = 31;

        BigInteger A = BigInteger.valueOf(45);
        BigInteger B = BigInteger.valueOf(23);
        BigInteger result = A.pow(B.intValue());

        BigInteger result1 = A.add(B);
        BigInteger result2 = A.subtract(B);
        BigInteger result3 = A.divide(B);
        BigInteger result4 = A.multiply(B);

        BigInteger bigInteger1 = BigInteger.TEN;

        System.out.println(result);
        System.out.println(bigInteger1);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
