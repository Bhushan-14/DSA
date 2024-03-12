package BigInteger;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        double x = 0.03;
        double y = 0.04;
        System.out.println(x-y);

        BigDecimal X = new BigDecimal("0.03");
        BigDecimal Y = new BigDecimal("0.04");
        BigDecimal ans = X.subtract(Y);
        System.out.println(ans);

        BigDecimal A = new BigDecimal("32536547.252525254");
        BigDecimal B = new BigDecimal("54234563625.324141241");
        System.out.println(B.add(A));
        System.out.println(B.subtract(B));
        System.out.println(B.multiply(A));
        System.out.println(B.pow(6));
        System.out.println(B.scale());
    }
}
