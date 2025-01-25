import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int n, m;

    static boolean[][] visited;
    static int[][] arrMaze;
    static int[][] distMaze;
    static int distMax = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arrMaze = new int[n][m];
        visited = new boolean[n][m];
        distMaze = new int[n][m];


        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                arrMaze[i][j] = Integer.parseInt(str.charAt(j) + "");
            }
        }

        bfs(0, 0);
        System.out.println(distMax+1);



    }

    public static void bfs(int i, int j) {
        int[] dirI = {0, 1, 0, -1};
        int[] dirJ = {1, 0, -1, 0};

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i, j});
        visited[i][j] = true;

        int flag = 0;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int curI = cur[0];
            int curJ = cur[1];

            for (int k = 0; k < 4; k++) {
                int nextI = curI + dirI[k];
                int nextJ = curJ + dirJ[k];
                if (nextI >= 0 && nextI < n && nextJ >= 0 && nextJ < m && !visited[nextI][nextJ] && arrMaze[nextI][nextJ] == 1) {
                    visited[nextI][nextJ] = true;
                    distMaze[nextI][nextJ] = distMaze[curI][curJ] + 1;
                    distMax = Math.max(distMax, distMaze[nextI][nextJ]);
                    q.offer(new int[]{nextI, nextJ});
                }
                if (nextI == n - 1 && nextJ == m - 1) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                break;
            }
        }
    }
}
