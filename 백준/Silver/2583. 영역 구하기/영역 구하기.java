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
        while (k-- > 0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            drawing(x1, y1, x2, y2);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    countTotalArea++;
                    dfs(i, j);
                    list.add(countCurrentArea);
                    countCurrentArea = 0;
                }
            }
        }


        System.out.println(countTotalArea);
        Collections.sort(list);
        for (int val : list) {
            System.out.print(val);
            System.out.print(" ");
        }


    }
    public static void drawing(int x1, int y1, int x2, int y2) {
        for (int i = y1; i < y2; i++) {
            for (int j = x1; j < x2; j++) {
                arr[i][j] = 1;
            }
        }
    }
    public static boolean checkRange(int i, int j) {
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

        for (int k = 0; k < 4; k++) {
            int nextX = i + dx[k];
            int nextY = j + dy[k];
            if (checkRange(nextX, nextY)&&!visited[nextX][nextY] && arr[nextX][nextY] == 0) {
                dfs(nextX, nextY);
            }
        }
    }
}
