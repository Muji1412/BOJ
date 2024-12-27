import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder(); // 스트링빌더를 써야지 효율이 좋음.

        int[][] array = new int[15][15];

        for (int i = 1; i <= 14; i++) {
            array[0][i] = i;
        }
        for (int j = 1; j <= 14; j++) {
            for (int k = 1; k <= 14; k++) {
                array[j][k] = array[j][k - 1] + array[j - 1][k];
            }
        }

        for (int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());
            sb.append(array[K][N] + "\n");
        }
        System.out.println(sb);
    }
}