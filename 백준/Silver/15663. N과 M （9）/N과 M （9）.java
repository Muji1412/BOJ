import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] arr;
    static int[] tempArr;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        tempArr = new int[n];
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        dfs(0);

        System.out.println(sb);

    }
    public static void dfs(int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(tempArr[i] + " ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            if (i > 0 && arr[i] == arr[i - 1] && !visited[i - 1]) {

                continue;
            }
            visited[i] = true;
            tempArr[depth] = arr[i];
            dfs(depth+1);
            visited[i] = false;
        }
        }
    }

