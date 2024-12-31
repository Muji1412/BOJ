import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 명시하지 않아도 기본값 0
        int n = scanner.nextInt();

        int[][] arr = new int[100][100];

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt() - 1 ;
            int y = scanner.nextInt() - 1 ;
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (arr[x+j][y+k] == 0) {
                        arr[x + j][y + k] = 1;
                    }
                }
            }
        }
        int counter = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (arr[i][j]==1) {
                    counter++;
                }
//                System.out.print(arr[i][j]);
            }
//            System.out.println();
        }
        System.out.println(counter);
    }
}
