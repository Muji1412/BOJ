import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M, H;
    static int totalTomato;

    static int[][] tomatoArr;
    static boolean[][] visited;
    static int[][] daysNeed;
    static int maxDay = 0;

    static ArrayList<ArrayList<Integer>> goodTomato = new ArrayList<>();
    static int goodTomatoCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        // 3차원 토마토 배열임
        // 근데 그대로 써도 될거같음
        // 배열의 개수 -> 가로는 그대로지만 세로는 M * H로 늘어남
        // 예를 들어서 5 3 2면, 5*6짜리 배열을 생성해야함

        tomatoArr = new int[N*H][M];
        visited = new boolean[N*H][M];
        daysNeed = new int[N*H][M];

        // 맨날n,m으로 받다가 M,N으로 받아서 순서가 헷갈림
        // M,N으로 받고있어서 잘 생각해야함



        for (int i = 0; i < N*H; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                tomatoArr[i][j] = Integer.parseInt(st.nextToken());
                if (tomatoArr[i][j] == 1 || tomatoArr[i][j] == 0) {
                    totalTomato++;
                    if (tomatoArr[i][j] == 1) {
                        goodTomato.add(new ArrayList<>());
                        goodTomato.get(goodTomatoCount).add(i);
                        goodTomato.get(goodTomatoCount).add(j);
                        goodTomatoCount++;
                    }
                }
            }
        }


        // 굿토마토 안에, i, j로 익은 토마토의 값이 들어있음


        bfs();

        int tempCount = 0;
        for (int i = 0; i < N*H; i++) {
            for (int j = 0; j < M; j++) {
                if (visited[i][j]) {
                    tempCount++;
                }
            }
        }



        if (tempCount == totalTomato) {
            System.out.println(maxDay);
        } else {
            System.out.println(-1);
        }

    }

    public static void bfs() {

        //결국 4방향을 6방향으로 만들어주면 되는 문제
        int[] dirI = {0, 1, 0, -1, N, -N};
        int[] dirJ = {1, 0, -1, 0, 0, 0};


        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i<goodTomato.size(); i++) {
            int startI = goodTomato.get(i).get(0);
            int startJ = goodTomato.get(i).get(1);
            q.offer(new int[]{startI, startJ});

            visited[startI][startJ] = true;
        }
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int curI = cur[0];
            int curJ = cur[1];


            for (int j = 0; j < 6; j++) {
                int nextI = curI + dirI[j];
                int nextJ = curJ + dirJ[j];
                // 그러니까, 4번째까지 2차원 이동, 5~6번은 3차원 이동을 해주는데
                // 2차원 이동에서 3차원 이동을 해버리는 문제가 있음
                if (j < 4 && curI / N != nextI / N) {
                    // 1234번째, 같은 층이 아닌 경우에는 무시한다.
                    continue;
                }
                if (rangeCheck(nextI, nextJ) && !visited[nextI][nextJ] && tomatoArr[nextI][nextJ] == 0) {
                    visited[nextI][nextJ] = true;
                    tomatoArr[nextI][nextJ] = 1;
                    daysNeed[nextI][nextJ] = daysNeed[curI][curJ] + 1;
                    maxDay = Math.max(maxDay, daysNeed[nextI][nextJ]);

                    q.offer(new int[]{nextI, nextJ});
                }
            }
        }

    }



    public static boolean rangeCheck(int i, int j) {

        if (i < 0 || i >= N*H || j < 0 || j >= M) {
            return false;
        }
        return true;
    }
}
