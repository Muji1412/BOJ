import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[9][9];

        int max = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scanner.nextInt();
                // 틀린 포인트 모든 값이 0이 들어온 경우, if문 충족 못해서 0,0으로 찍힘
                if (max<=arr[i][j]) {
                    max = arr[i][j];
                    x = i+1;
                    y = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.print(x + " " + y);
    }
}
