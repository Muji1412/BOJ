import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int start = 0;
    static int end = 0;
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    static boolean[] visited;
    static int flag = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        visited = new boolean[n+1];


        // a에서 b까지의 촌수계산
        start = sc.nextInt();
        end = sc.nextInt();

        int m = sc.nextInt(); // 부모관계 몇번

        while (m-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.get(a).add(b);
            list.get(b).add(a);
        }
        dfs(start, 0);

        if (flag == 0) {
            System.out.println(-1);
        }

    }

    public static void dfs(int start, int count) {
        if (start == end) {
            System.out.println(count);
            flag = 1;
            return;
        }
        visited[start] = true;

        for (int cur : list.get(start)) {
            if (!visited[cur]) {
                dfs(cur, count + 1);
            }
        }
    }
}
