import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int m;

    static int counter = -1;
    static int arr[][];
    static boolean[][] visited;
    static boolean[][] breakWallVisited;
    static boolean completed;
    static int [][] movesNeed;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n + 1][m + 1];
        visited = new boolean[n + 1][m + 1];
        movesNeed = new int[n + 1][m + 1];
        breakWallVisited = new boolean[n + 1][m + 1];
        completed = false;

        for (int i = 1; i <= n; i++) {
            String s = br.readLine();

            for (int j = 1; j <= m; j++) {
                arr[i][j] = s.charAt(j - 1) - '0';
            }
        }

        bfs(1,1);

        System.out.println(counter);

        // 벽 부수고 이동하기
        // 0은 통로, 1은 벽
        // 0,0에서 n,m까지 가야함. 1,1부터 시작하고싶으니까 n+1로 만들기
        // bfs로 최단경롤를 만들되, '벽 부쉈다' 라는 불린값 필요할듯
        // 추가로 도달한 경우, 도달을 못한 경우를 구별하기 위해 도착 성공 불린값 필요

        // 6 5
        //00000
        //11110
        //00000
        //01111
        //01111
        //00010 이 반례가 주 원인.
    }
    static boolean isInBound(int i, int j) {
        if (i < 1 || i > n || j < 1 || j > m) {
            return false;
        }
        return true;
    }
    static void bfs(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int wallPassed = 0; // 0이면 아직 안부순 상태, 1이면 부순상태
        int timePassed = 0;
        visited[i][j] = true;
        queue.offer(new int[]{i, j, wallPassed, timePassed});

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];
            int curWallpassed = cur[2];

            if (curX == n && curY == m) {
                completed = true;
                counter = movesNeed[curX][curY] + 1;
                break;
            }

            for (int k = 0; k < 4; k++) {
                int nextX = cur[0] + dx[k];
                int nexyY = cur[1] + dy[k];

                // 1. 벽을 아직 부수지 않은 경우, 0이든 1이든 상관없이 갈 수 있음. 이후 +1해줌
                if (curWallpassed == 0) {
                    if (isInBound(nextX,nexyY) && !visited[nextX][nexyY] && arr[nextX][nexyY] == 0) { // 안부쉈을때, 0인 경우,
                        visited[nextX][nexyY] = true;
                        movesNeed[nextX][nexyY] = movesNeed[curX][curY] + 1;
                        queue.offer(new int[]{nextX, nexyY, curWallpassed});


                    } else if (isInBound(nextX,nexyY) && !visited[nextX][nexyY] && arr[nextX][nexyY] == 1) { // 안부쉈을떄, 다음 벽이 1인 경우
                        visited[nextX][nexyY] = true;
                        movesNeed[nextX][nexyY] = movesNeed[curX][curY] + 1;
                        int nextWallPassed = curWallpassed + 1; //벽부숨 체크
                        queue.offer(new int[]{nextX, nexyY, nextWallPassed});
                    } // 2. 이미 벽 부순 경우
                }else if (curWallpassed == 1) {
                    if(isInBound(nextX,nexyY) && !breakWallVisited[nextX][nexyY] && arr[nextX][nexyY] == 0) { //부수고 난 후, 0인 벽만 통과가능함.
                        breakWallVisited[nextX][nexyY] = true;
                        movesNeed[nextX][nexyY] = movesNeed[curX][curY] + 1;
                        queue.offer(new int[]{nextX, nexyY, curWallpassed});
                    }
                }
            }
        }





    }
}
