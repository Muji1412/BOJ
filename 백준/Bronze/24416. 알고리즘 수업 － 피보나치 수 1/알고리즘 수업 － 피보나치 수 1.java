import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int[] dp = new int[a+1];

        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= a; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[a] + " " + (a - 2));
    }
}
