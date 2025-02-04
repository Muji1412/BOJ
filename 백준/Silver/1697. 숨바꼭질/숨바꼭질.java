import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {


    static int n, dest;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        dest = sc.nextInt();
        visited = new boolean[100001];

        // 현재 점 a에 있고 b를 가야함
        // 가능한 움직임
        // 현재 위치 2배
        // +1
        // -1


        // bfs 해야함
        System.out.println(bfs(n, 0));
    }

    public static int bfs(int start, int now) {
        if (start == dest) {
            return now;
        }
        Queue<int[]> q = new LinkedList<int[]>();
        q.add(new int[]{start, now});
        visited[start] = true;
        while (!q.isEmpty()) {


            int[] cur = q.poll();
            int curIndex = cur[0];
            int curVal = cur[1];

            if (curIndex == dest) {
                return curVal;
            }

            int plusIndex = curIndex + 1;
            int minusIndex = curIndex - 1;
            int x2index = curIndex * 2;
            int plusVal = curVal + 1;


            if (x2index<100001&&!visited[x2index]) {
                q.offer(new int[]{x2index, plusVal});
                visited[x2index] = true;
            }
            if (plusIndex<100001&& !visited[plusIndex]) {
                q.offer(new int[]{plusIndex, plusVal});
                visited[plusIndex] = true;
            }
            if (minusIndex>-1&&!visited[minusIndex]) {
                q.offer(new int[]{minusIndex, plusVal});
                visited[minusIndex] = true;
            }
        }
        return 0;
    }
}
