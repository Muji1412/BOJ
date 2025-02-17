import java.util.Scanner;

public class Main {
    static int n, m;
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1이 땅이고 0이 못가는곳
        while (true) {
            int count = 0;
            m = sc.nextInt();
            n = sc.nextInt();
            if (n == 0 && m == 0) break;

            arr = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] == 1) {
                        count++;
                        bfs(i, j);
//                        Print2D.print2DArray(arr);

                    }
                }
            }

            System.out.println(count);
        }
    }
    public static boolean rangeCheck(int i, int j) {
        if (i < 0 || i >= n || j < 0 || j >= m) return false;
        return true;
    }
    public static void bfs(int i, int j) {
        int[] dx={-1, 0, 1, 0,-1,-1,1,1};
        int[] dy = {0, 1, 0, -1, -1, 1, -1, 1};

        for (int k = 0; k < 8; k++) {
            int nextI = i + dx[k];
            int nextJ = j + dy[k];

            if (rangeCheck(nextI, nextJ) && arr[nextI][nextJ] == 1) {
                arr[nextI][nextJ] = 0;
                bfs(nextI, nextJ);
            }
        }
    }
}
