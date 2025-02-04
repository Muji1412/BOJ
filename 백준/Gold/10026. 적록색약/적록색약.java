import java.util.Scanner;

public class Main {

    static int n;

    static int[][] colorBlindArr;
    static boolean[][] colorBlindArrVisited;
    static int colorBlindCount = 0;


    static char[][] normalArr;
    static boolean[][] normalArrVisited;
    static int normalCount = 0;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        colorBlindArr=new int[n][n];
        colorBlindArrVisited=new boolean[n][n];

        normalArr=new char[n][n];
        normalArrVisited=new boolean[n][n];

        String str;
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            str = sc.nextLine();
            for (int j = 0; j < n; j++) {
                char ch = str.charAt(j);
                normalArr[i][j] = ch;
                if (ch == 'B') {
                    colorBlindArr[i][j] = '1';
                } else {
                    colorBlindArr[i][j] = '0';
                }
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!normalArrVisited[i][j]) {
                    normalArrCheck(i, j);
                    normalCount++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!colorBlindArrVisited[i][j]) {
                    colorBlindedArrCheck(i, j);
                    colorBlindCount++;

                }
            }
        }


        System.out.println(normalCount+ " " + colorBlindCount);

    }

    // for문으로 돌려서, visited가 false 인 경우를 잡아서 거기서 시작, 얘는 그냥 방문하는거만 해주면 됨
    public static boolean rangeCheck(int i, int j) {
        if (i < 0 || j < 0 || i >= n || j >= n) {
            return false;
        } else {
            return true;
        }
    }

    public static void normalArrCheck(int startI, int startJ) {
        // 노말에리어 - > R,G,B 있음
        char curCh = normalArr[startI][startJ];
        normalArrVisited[startI][startJ] = true;
        int[] dirX = {-1, 1, 0, 0};
        int[] dirY = {0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {
            int nextI = startI + dirX[i];
            int nextJ = startJ + dirY[i];
            if (rangeCheck(nextI, nextJ) && !normalArrVisited[nextI][nextJ] && curCh == normalArr[nextI][nextJ]) {
                normalArrVisited[nextI][nextJ] = true;
                normalArrCheck(nextI, nextJ);
            }
        }
    }

    public static void colorBlindedArrCheck(int startI, int startJ) {
        int curI = colorBlindArr[startI][startJ];
        colorBlindArrVisited[startI][startJ] = true;

        int[] dirX = {-1, 1, 0, 0};
        int[] dirY = {0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {
            int nextI = startI + dirX[i];
            int nextJ = startJ + dirY[i];
            if (rangeCheck(nextI,nextJ) && !colorBlindArrVisited[nextI][nextJ] && curI == colorBlindArr[nextI][nextJ]) {
                colorBlindArrVisited[nextI][nextJ] = true;
                colorBlindedArrCheck(nextI, nextJ);
            }
        }
    }


}
