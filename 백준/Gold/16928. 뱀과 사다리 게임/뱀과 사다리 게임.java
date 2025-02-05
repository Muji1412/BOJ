import java.util.*;

public class Main {

    static boolean[] visited = new boolean[101];
    static HashMap<Integer, Integer> ladderMap = new HashMap<Integer, Integer>();
    static HashMap<Integer, Integer> snakeMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            ladderMap.put(a, b);
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            snakeMap.put(a, b);
        }

        System.out.println(bfs());

    }


    public static int bfs() {
        // 주사위 굴려서 나오는건 1-6
        // 게임의 목표는 1번 칸에서 시작해서 100번 칸에 도착하는 것이다.
        // 시작은 1, 도착은 100

        Queue<int[]> q = new LinkedList<int[]>();
        q.add(new int[]{1, 0});
        visited[1] = true;
        while (!q.isEmpty()) {


            int[] poll = q.poll();
            int curIndex = poll[0];
            int curDice = poll[1];

            if (curIndex == 100) {
                return curDice;
            }


            // + 1,2,3,4,5,6
            for (int i = 1; i <= 6; i++) {
                int nextIndex = curIndex + i;

                if (nextIndex <= 100 && !visited[nextIndex]) {
                    visited[nextIndex] = true;
                    if (ladderMap.containsKey(nextIndex)) {
                        q.offer((new int[]{ladderMap.get(nextIndex), curDice + 1}));
                    } else if (snakeMap.containsKey(nextIndex)) {
                        q.offer(new int[]{snakeMap.get(nextIndex), curDice + 1});
                    } else {
                        q.offer(new int[]{nextIndex, curDice + 1});
                    }
                }
            }

        }
        return -1;
    }
}
