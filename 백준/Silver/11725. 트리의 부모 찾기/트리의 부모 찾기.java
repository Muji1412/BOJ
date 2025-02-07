import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static List<List<Integer>> list = new ArrayList<List<Integer>>();
    static boolean[] visited;
    static int[] findParent;
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 1; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.get(a).add(b);
            list.get(b).add(a);
        }

        findParent = new int[n+1];
        visited = new boolean[n+1];

        // 1. 이중인티저리스트 만듬, 거기다가 넣어줌
        // 2. bfs로탐색
        // 3. 값 저장할 배열 하나 만들어서 거기서 저장

        bfs();
        for (int i = 2; i < n+1; i++) {
            System.out.println(findParent[i]);
        }


    }
    public static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        visited[1] = true;
        while (!q.isEmpty()) {
            int cur = q.poll();

            for (int num : list.get(cur)) {
                if (!visited[num]) {
                    visited[num] = true;
                    findParent[num] = cur;
                    q.add(num);
                }
            }
        }
    }
}
