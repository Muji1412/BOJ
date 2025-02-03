import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int count = 0;

    static boolean[][] visited;
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());


        int startI = 0;
        int startJ = 0;
        arr = new char[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = str.charAt(j);
                if (arr[i][j] == 'I') {
                    startI = i;
                    startJ = j;
                }
            }
        }

//        Print2D.print2DArray(arr);

        dfs(startI, startJ);

        if (count == 0) {
            System.out.println("TT");
        } else {
            System.out.println(count);
        }

    }
    public static boolean rangeCheck(int i, int j) {
        if (i < 0 || i >= n || j < 0 || j >= m) {
            return false;
        }
        return true;
    }

    public static void dfs(int i, int j) {
        int[] dirX = {-1, 0, 1, 0};
        int[] dirY = {0, -1, 0, 1};

        visited[i][j] = true;
        for (int k = 0; k < 4; k++) {
            int nextI = i + dirX[k];
            int nextJ = j + dirY[k];

            if (rangeCheck(nextI, nextJ) && !visited[nextI][nextJ] && arr[nextI][nextJ] != 'X') {
                dfs(nextI, nextJ);
                if (arr[nextI][nextJ] == 'P') {
                    count++;
                }
            }
        }
    }
}
