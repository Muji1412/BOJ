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

        dfs(0, 1);
        System.out.println(sb);

        // 결국 재귀로 풀어야함
        // n개 숫자고, depth가 m까지 갔을때 출력한다는건 여전함

    }

    public static void dfs(int dep, int start) {
        if (dep == m) {
            for (int v : arr) {
                sb.append(v).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = start; i <= n; i++) {

            arr[dep] = i;
            dfs(dep + 1, i);

        }
    }
}

