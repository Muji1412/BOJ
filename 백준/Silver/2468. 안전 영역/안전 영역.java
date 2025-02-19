import java.util.Scanner;

public class Main {
    static int n;
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        int biggest = 0;

        for (int i = 1; i < 101; i++) {
            biggest = Math.max(biggest, countSafeZone(i));
        }

        System.out.println(biggest);

        // 지형별 높이에 따라, 안전구역을 구해야함
        // 높이는 1 이상 100 이하의 정수
        // 그러니까 1부터 100까지 비교해야함;
    }
    static int countSafeZone(int waterLevel) {
        // 메인메서드에서 1부터 100까지 for문으로 반복
        // 거기서 받은 워터레벨 따라 안전지대의 개수를 리턴해줌
        int[][] newArr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] < waterLevel) {
                    newArr[i][j] = 0;
                } else {
                    newArr[i][j] = 1;
                }
            }
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (newArr[i][j] == 1) {
                    zoneChecker(newArr, i, j);
                    count++;

                }
            }
        }

        return count;
    }
    static void zoneChecker(int[][] arrs, int i, int j) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        for (int k = 0; k < 4; k++) {
            int nx = i + dx[k];
            int ny = j + dy[k];
            if (rangeCheck(nx, ny)) {
                if (arrs[nx][ny] == 1) {
                    arrs[nx][ny] = 0;
                    zoneChecker(arrs, nx, ny);

                }
            }
        }
    }
    static boolean rangeCheck(int i, int j) {
        if (i >= n || j >= n || i < 0 || j < 0) {
            return false;
        }
        return true;
    }
}
