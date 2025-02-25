import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n+1][n+1];
        int[][] dp = new int[n+1][n+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i+1; j++) {
                arr[i][j] = sc.nextInt();
            }

        }


        dp[1][1] = arr[1][1];
        for (int i = 1; i <= n; i++) { // 1일때
            for (int j = 1; j < i+1; j++) { // 0부터 2까지 1, 00, = + i + j 1, 0
                dp[i][j] = Math.max(dp[i-1][j-1] +arr[i][j], dp[i-1][j] + arr[i][j]);
            }
        }

        int a = 0;
        for (int i = 1; i <= n; i++) {
            a = Math.max(a, dp[n][i]);
        }

        System.out.println(a);
    }
}
