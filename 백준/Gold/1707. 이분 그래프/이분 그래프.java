import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static List<List<Integer>> graph;
    static int[] colors;
    static boolean isBipartite;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        // 시행횟수
        StringBuilder sb = new StringBuilder();


        while (testCase-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            graph = new ArrayList<>();
            for (int i = 0; i <= v; i++) {
                graph.add(new ArrayList<>());
            }

            for (int i = 0; i < e; i++) {
                st = new StringTokenizer(br.readLine());
                int U = Integer.parseInt(st.nextToken());
                int V = Integer.parseInt(st.nextToken());

                graph.get(U).add(V);
                graph.get(V).add(U);
            }

            colors = new int[v + 1];
            isBipartite = true;

            for (int i = 1; i <= v; i++) {
                if (colors[i] == 0) {
                    dfs(i, 1);
                }
            }

            if (isBipartite) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }


        }

        System.out.println(sb);
    }
    static void dfs(int node, int color) {
        colors[node] = color;

        for (int next : graph.get(node)) {
            if (colors[next] == 0) {
                dfs(next, 3 - color);
            } else if (colors[next] == color) {
                // 인접 노드가 같은 색이면 이분 그래프가 아님
                isBipartite = false;
                return;
            }
        }
    }
}
