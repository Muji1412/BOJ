import java.util.*;

public class Main {
    static int N, M, R;
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    static int[] arr;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        R = sc.nextInt();


        // 정점 N, 간선 M

        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }
        arr = new int[N + 1];
        Arrays.fill(arr, -1);
        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            list.get(a).add(b);
            list.get(b).add(a);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(list.get(i));
        }



        dfs(R,0);

        for (int i = 1; i <= N; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void dfs(int a, int depth) {
        visited[a] = true;
        arr[a] = depth;
        for (int val : list.get(a)) {
            if (!visited[val]) {
                dfs(val, depth + 1);
            }
        }
    }
}
