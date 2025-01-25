import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
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



        // 토마토 주어짐
        // 1은 익은 토마토, 0은 익지 않은 토마토, -1은 토마토가 없는 상태
        // 익은 토마토는 상하좌우의 토마토가 다음날 익게 만들어줌
        // 모두 익을때의 최소 날짜를 출력, 시작부터 전부 익었으면 0 출력, 전부 익지 못하는 상황이면 -1 출력

        // 익은 토마토가 여러개인게 문제임
        // 시작지점이 2개면, bfs를 한번 실행시키고 다음 bfs을 실행시키면 안됨

        // bfs를 바꿔야하나?
        // 일단 익은 토마토의 개수와 위치가 필요함
        // bfs 실행하면서, 익은 개수만큼 실행,
        // bfs를 한단계씩 실행해야함

        tomatoArr = new int[N][M];
        visited = new boolean[N][M];
        daysNeed = new int[N][M];



        for (int i = 0; i < N; i++) {
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
        for (int i = 0; i < N; i++) {
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
        int[] dirI = {0, 1, 0, -1};
        int[] dirJ = {1, 0, -1, 0};

        // bfs를 실행하되 시작할때 갖고있는 익은 토마토 개수에 따라 달라지게 만들어야함
        // daysNeed 배열에 이전에 사용했던(nextI, nextJ) 에 값을 불러와 +1 해주면 몇일인지 나옴
        // bfs 문 안에서 비교해서, 스태틱 maxDay로 저장


        // 큐 선언, 지금 굿토마토에는 몇개가 있는지 나와있음.
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

            for (int j = 0; j < 4; j++) {
                int nextI = curI + dirI[j];
                int nextJ = curJ + dirJ[j];
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
        if (i < 0 || i >= N || j < 0 || j >= M) {
            return false;
        }
        return true;
    }
}
