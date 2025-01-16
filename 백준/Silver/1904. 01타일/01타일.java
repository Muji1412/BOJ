import java.util.Scanner;

public class Main {
    static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        dp = new int[n+2];
        dp[1] = 1;
        dp[2] = 2;

        if (n == 1) {
            System.out.println("1");
            return;
        }

        arrayMake(n);
        System.out.println(dp[n]);

    }
    static void arrayMake(int n) {
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 15746;
        }
    }

}
