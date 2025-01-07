import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String a = br.readLine();
            map.put(a, i);
            map2.put(i, a);

        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            String a = br.readLine();
            if (a.charAt(0)>=65 && a.charAt(0)<=122) {
                sb.append(map.get(a)).append("\n");
            }
            else {
                Integer pokeNum = Integer.parseInt(a);
                sb.append(map2.get(pokeNum)).append("\n");
            }
        }
        System.out.println(sb);
    }
}
