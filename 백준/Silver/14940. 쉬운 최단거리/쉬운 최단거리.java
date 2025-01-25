import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    
    // 주 의 점
    // 제발 입력할때 메모장에 옮겨서 예제 바꾸고, 그 다음에 입력하기
    // 백준 예제 바로 터미널에 넣어놓고 수정하는 멍청한짓 하지 말것

    static int N, M;

    static int[][] arr;
    static boolean[][] visited;
    static int[][] distance;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());


        arr = new int[N][M];
        visited = new boolean[N][M];
        distance = new int[N][M];

        int startI = 0;
        int startJ = 0;


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 2) {
                    startI = i;
                    startJ = j;
                }
            }
        }
        bfs(startI, startJ);

        // 1. 거리 출력
        // 2. 원래 갈 수 없는 땅인 부분은 0 출력
        // 3. 갈 수는 있지만, 탐색으로 갈 수 없는 부분은 -1 출력

//        Print2D p2 = new Print2D();
//        p2.print2DArray(arr);
        
        
        
        

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (visited[i][j]) {
                    sb.append(distance[i][j]).append(" ");
                } else { // 가지 못했거나, 애초에 갈 수 없는 부분들을 예외처리해주는 부분
                    // visited false인데 0이면 0출력, 1이면 -1 출력
                    if (arr[i][j] == 0) {
                        sb.append(distance[i][j]).append(" ");
                    } else {
                        sb.append("-1 ");
                    }
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }

    public static void bfs(int i, int j) {

        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{i, j});
        int[] dirI = {0, 1, 0, -1};
        int[] dirJ = {1, 0, -1, 0};
        visited[i][j] = true;

        // 상하좌우 값 체크, 가는곳의 값이 1이여야 갈수있고, visited여부 체크
        // 와일문 안에 for문 넣어서 체크해야함
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int curI = cur[0];
            int curJ = cur[1];

            // 4방향 체크
            for (int k = 0; k < 4; k++) {
                int nextI = curI + dirI[k];
                int nextJ = curJ + dirJ[k];
                // 범위값 체크, visited 체크, arr 내의 값이 1일때만 갈수있게
                if (rangeCheck(nextI, nextJ) && !visited[nextI][nextJ] && arr[nextI][nextJ] == 1) {
                    visited[nextI][nextJ] = true;
                    q.offer(new int[]{nextI, nextJ});
                    distance[nextI][nextJ] = distance[curI][curJ] + 1;
                }
            }
        }


    }

    public static boolean rangeCheck(int row, int col) {
        if (row < 0 || row >= N || col < 0 || col >= M) {
            return false;
        }
        return true;
    }
}
