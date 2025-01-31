import java.util.Scanner;

public class Main {
    static String[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        arr = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = "*";
            }
        }

        redoMaker(0, 0, n);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }

        System.out.println(sb);

        // 가운데만 뻥 뚫고 나머지 8방향을 재귀해주는 방식
    }

    public static void redoMaker(int x, int y, int size) {

        // 이거 없으면 오버플로우됨
        if (size == 1) {
            return;
        }

        // 현재 사이즈에 따라, x y 를 시작지점으로 받아서 제거해주기
        int third = size / 3;
        int startI = x + third;
        int startJ = y + third;
        int endI = startI + third - 1;
        int endJ = startJ + third - 1;

        for (int i = startI; i <= endI; i++) {
            for (int j = startJ; j <= endJ; j++) {
                arr[i][j] = " ";
            }
        }

        //8방향 만들어줘야함

        // 시작 9 9 기준
        // 0 0, 0 3, 0 6
        // 3 0, 3 3, 3 6
        // 6 0, 6 3, 6 6

        // 시작 3 3 기준
        // 0,0 0,1 0,2
        // 1,0 1,1 1,2
        // 2,0 2,1 2,2
        
        
        redoMaker(x, y, third);
        redoMaker(x, y + third, third);
        redoMaker(x, y + third * 2, third);

        redoMaker(x + third, y, third);
        redoMaker(x + third, y + third * 2, third);

        redoMaker(x + third * 2, y, third);
        redoMaker(x + third * 2, y + third, third);
        redoMaker(x + third * 2, y + third * 2, third);
    }
}
