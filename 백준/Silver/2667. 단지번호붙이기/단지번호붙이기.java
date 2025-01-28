import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int M;
    static int counter = 0;

    static boolean[][] visited;
    static int[][] arr;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        M = Integer.parseInt(br.readLine());
        arr = new int[M][M];

        String str;

        for (int i = 0; i < M; i++) {
            str = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        // dfs로 돌리기
        // 스태틱 카운터 만들어서 for문 돌리기, dfs 시작할때 0 집어넣고, 출력할때 리스트문에 add해줘야함

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == 1) {
                    counter = 0;
                    dfs(i, j);
                    list.add(counter);
                }
            }
        }

        System.out.println(list.size());
        Collections.sort(list);
        for (int val : list) {
            System.out.println(val);
        }

    }

    // 탐색 그냥 dfs문 재귀로 변경, 카운트로 체크만 하고 뱉어주는게 더 간단할듯
    public static void dfs(int i, int j) {
        int[] dirX = {-1, 1, 0, 0};
        int[] dirY = {0, 0, -1, 1};

        arr[i][j] = 0;
        counter++;

        for (int k = 0; k < 4; k++) {
            int nextX = i + dirX[k];
            int nextY = j + dirY[k];
            if (rangeCheck(nextX, nextY) && arr[nextX][nextY] == 1) {
                dfs(nextX, nextY);
            }
        }
    }




    public static boolean rangeCheck(int i, int j) {
        if (i < 0 || i >= M || j < 0 || j >= M) {
            return false;
        }
        return true;
    }
}
