import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] dp= new int[n+1];
        dp[0] = 0;
        dp[1] = 1;


        for (int i = 2; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                // i 가 25가 들어감
                // 최소값을 찾아냄, 거기서 +1하면 됨
                // 10을 넣어봄, 1,2,3을 넣어봤음
                // 어? 9 넣었을때 남는게 제일 낮네?
                // 그럼 하나만 추가해주면 되겠지
                min = Math.min(min, dp[i - j * j]);

            }
            dp[i] = min + 1;
        }

        System.out.println(dp[n]);

    }
}
