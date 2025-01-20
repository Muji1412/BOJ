import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int ZERO = 0;
    static int ONE = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N+1][N+1];

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        checkArr(arr, 1, 1, N, N);

        System.out.println(ZERO);
        System.out.println(ONE);

    }

    public static void checkArr(int[][] arr, int a, int b, int c, int d) {

        // 1부터 8을 체크함
        // 3/4분면을 제외한 분면들이 안됐음
        // 그냥 1,1 ~ 8,8 이렇게 체크해주는게 낫나?
        // 지금 이 값이 안됐음. 그럼 값을 어떻게 만들어줘야하나
        // 1, 1, 8, 8 이었음
        // 1, 1, 4, 4 1사
        // 1, 4, 5, 8 2사
        // 5, 8, 1, 4 4사

        // 0인지 1인지 판별하는 메서드 실행

        if (arr[a][b] == 0) {
            if (isThisZero(arr, a, b, c, d)) {
                ZERO++;
                return;
            }
        } else if (isThisOne(arr, a, b, c, d)) {
            ONE++;
            return;
        }




        int halfC = (a + c) / 2;
        int halfD = (b + d) / 2;

        checkArr(arr, a, b, halfC, halfD);// (1,1) (8,8) => 1,1, 4,4로 바꿔줌
        checkArr(arr, halfC + 1, halfD + 1, c, d); //5,5 8,8
        checkArr(arr, a, halfD + 1, halfC, d); //1~4,5~8
        checkArr(arr, halfC + 1, b, c, halfD); //5~8,1~4


    }

    public static boolean isThisOne(int[][] arr,int a, int b, int c, int d){
        for(int i = a; i <= c; i++){
            for(int j = b; j <= d; j++){
                if (arr[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isThisZero(int[][] arr,int a, int b, int c, int d){
        for(int i = a; i <= c; i++){
            for(int j = b; j <= d; j++){
                if (arr[i][j] == 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
