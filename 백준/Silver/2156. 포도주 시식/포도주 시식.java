import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //포도주 잔을 선택하면 그 잔에 들어있는 포도주는 모두 마셔야 하고, 마신 후에는 원래 위치에 다시 놓아야 한다.
        //연속으로 놓여 있는 3잔을 모두 마실 수는 없다.

        // 3잔만 마실수 있는게 아님, 마실 수 있는 와인의 최대 수는 없음
        // 3잔 연속 마시는것만 아니면 됨.

        int[] arr = new int[n+1];
        int[] dp = new int[n+1];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        dp[1] = arr[1];
        if (n > 1) {
            dp[2] = arr[1] + arr[2];
        }


        for (int i = 3; i <= n; i++) {
            int a1 = dp[i - 1];
            int a2 = arr[i] + dp[i - 2];
            int a3 = dp[i - 3] + arr[i - 1] + arr[i];
            dp[i] = Math.max(a1, Math.max(a2, a3));
        }

        System.out.println(dp[n]);


    }
}
