import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        // 이줄배열로 만들고, 0에는 R, 1에는 G, 2에는 B값 넣어서 dp해줘야함
        int[][] dp = new int[n][3];

        for (int i = 0; i < n; i++) {
            dp[i][0] = sc.nextInt();
            dp[i][1] = sc.nextInt();
            dp[i][2] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            dp[i][0] += Math.min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] += Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] += Math.min(dp[i - 1][1], dp[i - 1][0]);
        }

        int result = Math.min(dp[n - 1][1], Math.min(dp[n - 1][2], dp[n - 1][0]));

        System.out.println(result);
    }
}

