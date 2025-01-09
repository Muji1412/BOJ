import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String,String> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            String site = st1.nextToken();
            String pw = st1.nextToken();
            map.put(site,pw);

        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            sb.append(map.get(br.readLine())).append('\n');
        }

        System.out.println(sb);

    }
}
