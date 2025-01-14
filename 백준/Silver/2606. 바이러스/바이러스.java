import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int count = 0;
    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nodes = sc.nextInt();
        visited = new boolean[nodes + 1];

        for (int i = 0; i <= nodes; i++) {
            graph.add(new ArrayList<>());
        }

        int edges = sc.nextInt();
        for (int i = 0; i < edges; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            addedge(a, b);
        }

        dfs(1);

        System.out.println(count-1);





    }
    public static void addedge(int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    public static void dfs(int node) {
        visited[node] = true;
        count++;

        for (int v : graph.get(node)) {
            if (!visited[v]) {
                dfs(v);
            }
        }
    }
}
