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
    }
}
