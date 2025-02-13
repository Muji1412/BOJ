import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int n,m;

    static int countTotalArea = 0;
    static int countCurrentArea = 0;
    static int[][] arr;
    static boolean[][] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        int k = sc.nextInt();
        arr = new int[n][m]; // 빈 곳은 기본값인 0으로 냅두고, 채워야할 부분은 1로 바꿔넣기
        visited = new boolean[n][m];
        while (k-- > 0) { // k번만큼 모눈종이에 색칠해줌
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            drawing(x1, y1, x2, y2);
        }

        ArrayList<Integer> list = new ArrayList<>(); // 저장용 리스트


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) { // 전부 탐색, 0으로 빈곳이 남아있으면 dfs로 체크
                    countTotalArea++;
                    dfs(i, j);
                    list.add(countCurrentArea); // dfs에서 현재 체크중인 땅을 세주니까 그 값을 받아서 리스트에 삽입
                    countCurrentArea = 0; // 다음 dfs에서 또 써야하니까 초기화
                }
            }
        }


        System.out.println(countTotalArea);
        Collections.sort(list); // 문제에서 오름차순 정렬 요구
        for (int val : list) {
            System.out.print(val);
            System.out.print(" ");
        }


    }
    public static void drawing(int x1, int y1, int x2, int y2) { // 종이 칠해주는 메서드, 단, xy값 거꾸로 집어넣어야 정상적으로 작동
        // 수학에서의 x는 가로, y는 세로로 사용
        // 자바에서 2차원 배열은 int[n][m] 기준으로 n을 세로로, m을 가로로 사용하므로 거꾸로 넣어야 작동
        for (int i = y1; i < y2; i++) {
            for (int j = x1; j < x2; j++) {
                arr[i][j] = 1;
            }
        }
    }
    public static boolean checkRange(int i, int j) { // 범위체크 메서드, arr 밖으로 안나가게
        if (i < 0 || i >= n || j < 0 || j >= m) {
            return false;
        }
        return true;
    }

    public static void dfs(int i, int j) {
        int[] dx={-1, 0, 1, 0};
        int[] dy={0, 1, 0, -1};


        visited[i][j] = true;
        arr[i][j] = 1;
        countCurrentArea++;

        for (int k = 0; k < 4; k++) { // 위에 적어놓은 dx,dy 4방향에 대해서 탐색
            int nextX = i + dx[k];
            int nextY = j + dy[k];
            if (checkRange(nextX, nextY)&&!visited[nextX][nextY] && arr[nextX][nextY] == 0) {
                // arr 안에 있는지 + 이미 탐색한 곳이 아닌지 + 탐색할곳이 0인지에 대해 체크
                dfs(nextX, nextY);
                // 재귀
            }
        }
    }
}

