import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();

        long answer = honey(N);

        System.out.println(answer);




    }

    public static long honey(long n) {
        long result = 1L;
        long i = 0L;
        long honeyCount=0L;
        long honeyPlus1=0L;

        while (honeyPlus1 < n) {

            i=i+6;
            honeyCount = honeyCount + i;
            honeyPlus1 = honeyCount + 1;
//            System.out.println("i = " + i);
//            System.out.println("honeyCount = " + honeyCount);
//            System.out.println("honeyPlus1 = " + honeyPlus1);
            result++;
            }
        if (n == 1) {
            result = 1;
        }
        return result;
        }
    }

