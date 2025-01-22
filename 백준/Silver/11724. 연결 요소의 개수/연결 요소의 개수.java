import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static int nodeCount;
    static int ccCount;

    static boolean[] visited;
    static ArrayList<Integer>[] graph;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 1; i <= M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            addEdge(a, b);
        }

        // 그래프 세팅 완료
//        System.out.println(graph[N].size());

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i);
                ccCount++;
            }
            if (nodeCount == N) {
                break;
            }
        }
        System.out.println(ccCount);

    }
    public static void addEdge(int v, int w) {
        graph[v].add(w);
        graph[w].add(v);
    }

    public static void dfs(int v) {
        Stack<Integer> stack = new Stack<>();
        stack.push(v);

        while (!stack.isEmpty()) {
            int popped = stack.pop();
            if (!visited[popped]) {
                visited[popped] = true;
                nodeCount++;
            }

            for (int w : graph[popped]) {
                if (!visited[w]) {
                    stack.push(w);
                }
            }
        }
    }
}
