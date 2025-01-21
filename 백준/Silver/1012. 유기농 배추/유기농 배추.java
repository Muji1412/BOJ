import java.util.Scanner;

public class Main {

    // 재귀용 맵, 불린, 거리..값?
    static boolean[][] visted;
    static int map[][];

    // 사용할 값들
    static int N, M, K;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int TestCase = sc.nextInt();

        int count = 0;

        StringBuilder sb = new StringBuilder();

        while (TestCase-- > 0) {
            count = 0;
            N = sc.nextInt();
            M = sc.nextInt();
            K = sc.nextInt();



            // 받는값 0 0, 1 0 , 이런애들 죄다 맵 안에 값을 1로 만들어줘야함
            map = new int[N][M];
            visted = new boolean[N][M];
            for (int i = 0; i < K; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                map[a][b] = 1;
                }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[i][j] == 1 && visted[i][j] == false) {
                        DFS(i, j);
                        count++;
                    }
                }
            }
            sb.append(count + "\n");
        }

        System.out.println(sb);
    }

    public static void DFS(int i, int j) {
        visted[i][j] = true;


        // i값일때, j-1, j+1을 조회해주고
        // j일때, i-1, i+1을 조회하게 만들어야함
        // 1. i / j 두개 값이 어레이 밖으로 안나갔을때
        // 2. 거기 visted가 false일때
        // 3. 거기 map의 값이 1일때
        // 어! 거기는 배추가 있는 자리인데 벌레가 안간거네 -> dfs 재귀로 실행하기
        // 근데 어떻게 만들지

        // 4번 해야함
        int minI = i - 1;
        int minJ = j - 1;
        int plusI = i + 1;
        int plusJ = j + 1;


        if (rangeCheck(i, minJ) && map[i][minJ] == 1 && visted[i][minJ] == false) {
            DFS(i, minJ);
        }
        if (rangeCheck(i, plusJ) && map[i][plusJ] == 1 && visted[i][plusJ] == false) {
            DFS(i, plusJ);

        }
        if (rangeCheck(minI, j) && map[minI][j] == 1 && visted[minI][j] == false) {
            DFS(minI, j);

        }
        if (rangeCheck(plusI, j) && map[plusI][j] == 1 && visted[plusI][j] == false) {
            DFS(plusI, j);

        }

    }

    public static boolean rangeCheck(int i, int j) {
        if (i < 0 || i >= N || j < 0 || j >= M) {
            return false;
        }
        return true;
    }

}






    // dfs - 재귀로 구할거임
    // 밭을 맵처럼 만듬
    // [][] 맵 하나, visited 하나
    // 기본형으로 만들고, 어차피 기본값이면 false임
    //
    // 맵 기준으로, x가 같을때 y값이 -1 이거나 +1일때
    // 맵 기준으로, y가 같을떄 x값이 -1 이거나 +1일때
    // 얘네가 visted의 값이 false일때,
    // 아, 그냥 i j 이중 for문 돌려서 출력값 1일때 재귀 dfs 돌려주면 되겠구나

    // 만들어줄거
    // dfs 메서드
    // dfs 를 하기 위한 범위 체크용 메서드




