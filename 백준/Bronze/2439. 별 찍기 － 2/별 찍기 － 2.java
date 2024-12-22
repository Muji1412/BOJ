import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();


        // 1번째는 띄어쓰기 4개, 별 1개
        // 2번째는 3개 별 2개
        //
        for (int i = 1; i <= n; i++) {
            for (int j = n; j>i;j--) {
                System.out.print(" ");
            }
            for (int k = 0; k<i;k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
