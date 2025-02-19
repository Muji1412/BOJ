import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    static int n;
    static ArrayList<Integer[]> list[];
    static boolean[] visited;
    static int max = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        visited = new boolean[n+1];
        list = new ArrayList[n+1];



        for (int i = 0; i < n+1; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < n-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            list[a].add(new Integer[]{b, cost});
            list[b].add(new Integer[]{a, cost});
        }

        for (int i = 1; i <= n; i++) {
            Arrays.fill(visited, false);
            dfs(i, 0);
        }

        System.out.println(max);

        
    }
    static void dfs(int i, int sum) {
        visited[i] = true;
        max = Math.max(max, sum);

        for (Integer[] cur : list[i]) {
            int next = cur[0];
            int nextCost = cur[1];
            if (!visited[next]) {
                dfs(next, sum+nextCost);
            }
        }
    }
}
