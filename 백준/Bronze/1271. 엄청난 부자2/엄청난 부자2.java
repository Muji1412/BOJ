    import java.math.BigInteger;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // BigInteger
            BigInteger n = sc.nextBigInteger(); 
            BigInteger m = sc.nextBigInteger(); 

            // 몫과 나머지 계산
            BigInteger a = n.divide(m); // 몫
            BigInteger b = n.remainder(m); // 나머지

            System.out.println(a);
            System.out.println(b);
        }
    }