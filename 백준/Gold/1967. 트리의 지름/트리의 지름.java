import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static boolean[] visited;
    static ArrayList<ArrayList<node>> graph = new ArrayList<>();
    static int longest = 0;
    public static void main(String[] args) throws IOException {
        
        // 이중 어레이+node 버전
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        visited = new boolean[n + 1];
        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }
        StringTokenizer st;
        for (int i = 0; i < n-1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            graph.get(a).add(new node(b, cost));
            graph.get(b).add(new node(a, cost));
        }

        for (int i = 1; i <= n; i++) {
            Arrays.fill(visited, false);
            dfs(i, 0);
        }

        System.out.println(longest);



    }
    static class node{
        int vertex;
        int cost;

        node(int v, int c){
            this.vertex = v;
            this.cost = c;
        }
    }

    public static void dfs(int i, int sum) {
        visited[i] = true;
        longest = Math.max(longest, sum);

        for (node node : graph.get(i)) {
            int v = node.vertex;
            int cost = node.cost;
            if (!visited[v]) {
                dfs(v, cost+sum);
            }
        }
    }
}
