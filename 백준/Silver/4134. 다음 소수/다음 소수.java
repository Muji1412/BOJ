    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            long n = scanner.nextLong();

            for (long i = 0; i < n; i++) {
                nextPrime(scanner.nextLong());
            }




        }
        static void nextPrime(long b) {
            long a = 0;
            if (b == 1 || b == 0) {
                a = 2;
            } else {
                a = b;
            }
            for (long i = a; i <Long.MAX_VALUE; i++) {
                int flag = 0;
                for (long j = 2; j <= (long)Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println(i);
                    break;
                }

            }
        }
    }
