import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
            }

        int count = 0;

        for (int i = 0; i < m; i++) {
            if (set.contains(br.readLine())) {
                count++;
            }
        }

        System.out.println(count);
    }
}
