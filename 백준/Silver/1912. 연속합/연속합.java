import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n+1];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long[] DP = new long[n+1];
        DP[0] = arr[0];
        long maxVal = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            DP[i] = Math.max(DP[i - 1] + arr[i], arr[i]);
            if (i < n) {
                maxVal = Math.max(maxVal, DP[i]);
            }
        }
        maxVal = Math.max(maxVal, arr[0]);
        System.out.println(maxVal);
    }
}
