import java.util.Scanner;

public class Main {
    static int count = 1;
    static int needTwo = 2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        // n x n 2중배열
        // k 어디에 있는지 체크해서 출력
        int[][] arr = new int[n+1][n+1];



        // 만약 5 5이면
        // 2, 2이 시작점임
        //
        //  9	2	3
        //  8   1   4
        //  7	6	5

        // 시작함, 시작점 바로 윗부분을 시작점으로 잡음
        // 2 넣고, 2까지 가고, 계속 +1 하면서 넣다가 내가 원하는 지점 가면 스탑
        // 아래로 감, 가다가 원하는 값 나오면 스탑
        // 왼쪽 감, 가다가 스탑
        // 위로 감, 가다가 스탑, 값 저장, 바로 위에서부터 다시 시작
        // 23, 45, 67, 89 첫번째 넣을거
        // 10 11 12 13 , 14 15 16 18 두번째 넣을거

        // 고로, 처음에는 두번씩 넣고, 다음에는 네번 넣고, 다음에는 여섯번 넣고 반복시키면 됨

        // 시작지점 = n/2
        // 지금 5 x 5 만들거임
        // 그러니까 시작지점은 3,3인데 2,3부터 시작할거임

        // 두번 넣고, 2,3 / 2,4
        // 3,4 / 4,4
        // 4,3 / 4,2
        // 3,2 / 2,2
        // 끝나면 니드투에 2 넣어주기

        int howManyTimes = n / 2;

        int midIs = n / 2 + 1;
        arr[midIs][midIs] = 1;
        count++;


        // 2 넣어줄 시작점 만들어줌
        int curI = n / 2;
        int curJ = n / 2;



        // 위에서 아래로

        while (howManyTimes-- > 0) {
            for (int i = 0; i < needTwo; i++) {
                curJ++;
                arr[curI][curJ] = count;
                count++;
            }
            for (int i = 0; i < needTwo; i++) {
                curI++;
                arr[curI][curJ] = count;
                count++;
            }
            for (int i = 0; i < needTwo; i++) {
                curJ--;
                arr[curI][curJ] = count;
                count++;
            }
            for (int i = 0; i < needTwo; i++) {
                curI--;
                arr[curI][curJ] = count;
                count++;
            }
            curI--;
            curJ--;
            needTwo += 2;
        }

        int resultI = 0;
        int resultJ = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] == k) {
                    resultI = i;
                    resultJ = j;
                }
            }
            System.out.println();
        }
        System.out.println(resultI + " " + resultJ);



    }
    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("----------------------");
    }

}
