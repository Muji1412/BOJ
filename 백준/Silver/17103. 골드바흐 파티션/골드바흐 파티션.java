import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br    = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            int a = Integer.parseInt(br.readLine());

            // 체 만들기
            boolean[] prime = new boolean[a + 1];
            Arrays.fill(prime, true);
            prime[0] = prime[1] = false;

            for (int i = 2; i * i <= a; i++) {
                if (prime[i]) {
                    for (int j = i * i; j <= a; j += i) {
                        prime[j] = false;
                    }
                }
            }

            // 프라임 i = 트루면 소수
            // 시간복잡도 줄일려면 이중계산 없앨수있나?
            // 배열 다시 만들어서 0 나오면 break 만들어주기?

            int count = 0;

            for (int i = 0; i <= a / 2; i++) {
                if (prime[i] && prime[a - i]) {
                    count++;
                }
            }






            sb.append(count).append("\n");


        }

        System.out.println(sb);
    }
}
