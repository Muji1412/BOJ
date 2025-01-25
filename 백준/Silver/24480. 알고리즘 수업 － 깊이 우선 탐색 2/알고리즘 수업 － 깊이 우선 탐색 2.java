import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    static int N, M, I;


    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    static boolean[] visited;
    static int[] visitWhere;
    static int count = 1;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        I = Integer.parseInt(st.nextToken());


        visited = new boolean[N+1];
        visitWhere = new int[N+1];

        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            eddEdge(a, b);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(list.get(i), Collections.reverseOrder());
        }

        dfs(I);

        for (int i = 1; i <= N; i++) {
            System.out.println(visitWhere[i]);
        }

    }

    public static void dfs(int i) {
        visited[i] = true;
        visitWhere[i] = count++;

        for (int j : list.get(i)) {
            if (!visited[j]) {
                dfs(j);
            }
        }
    }
    public static void eddEdge(int a, int b) {
        list.get(a).add(b);
        list.get(b).add(a);
    }
}
