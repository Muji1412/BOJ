import java.util.Scanner;

public class Main {
    static long[] DP;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("0");
            return;
        }

        DP = new long[num+1];
        DP[0] = 0;
        DP[1] = 1;

        makeFibonacciArray(num);

        System.out.println(DP[num]);

    }
    static void makeFibonacciArray(int n) {
        for (int i = 2; i <= n; i++) {
            DP[i] = DP[i-1] + DP[i-2];
        }
    }
}
