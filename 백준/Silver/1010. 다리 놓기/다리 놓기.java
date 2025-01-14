import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        while (a-- > 0) {
            long n = sc.nextInt();
            long m = sc.nextInt();

            // 13 29
            // nCr = 29 - 17 / 13 1

            // 분모파트 먼저
            BigInteger numerator = BigInteger.ONE;
            BigInteger denominator = BigInteger.ONE;
            for (long i = 0; i < n; i++) {
                numerator = numerator.multiply(BigInteger.valueOf(m - i));
                denominator = denominator.multiply(BigInteger.valueOf(i + 1));
            }


            System.out.println(numerator.divide(denominator));
        }
    }
}
