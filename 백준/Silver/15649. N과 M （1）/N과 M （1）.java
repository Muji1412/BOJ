import java.util.Scanner;

public class Main {
    static int n, m;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    static int arr[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        visited = new boolean[n];
        arr = new int[m];

        dfs(0);
        System.out.println(sb);

    }

    public static void dfs(int dep) {
        if (dep == m) {
            for (int v : arr) {
                sb.append(v).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < n; i++) {

            // 방문 안했을때
            if (!visited[i]) {
                visited[i] = true;
                arr[dep] = i + 1;
                dfs(dep + 1);
                //이거 재사용해야하니까 false로 초기화 해줘야함 갔다 왔을때 해줄거임
                visited[i] = false;
            }
        }
    }
}
