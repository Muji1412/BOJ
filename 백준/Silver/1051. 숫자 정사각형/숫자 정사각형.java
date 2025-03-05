import java.io.IOException;
import java.util.Scanner;

public class Main {
    static int n;
    static int m;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();



        int[][] arr = new int[n][m];

        sc.nextLine();



        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < m; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        int maxLength = Math.max(n,m);

        // 시작은 0,0, 0,1, 1,0, 1,1 체크
        // 다음은 0,2, 2,0, 0,0, 2,2 체크


        // 꼭짓점의 수가 모두 같은 경우의 최대 넓이값이 필요함

        int max = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 1; k < maxLength-j; k++) {
                    if (rangeCheck(i+k,j+k)) {
                        if (arr[i][j] == arr[i][j+k] && arr[i][j+k] ==arr[i+k][j] && arr[i+k][j] == arr[i+k][j+k]) {
                            max = Math.max(max, (k+1) * (k+1));
                        }
                    }
                }
            }
        }

        System.out.println(max);


    }
    static boolean rangeCheck(int x, int y) {
        if (x<0 || y<0 || x>=n || y>=m) return false;
        return true;
    }
}
