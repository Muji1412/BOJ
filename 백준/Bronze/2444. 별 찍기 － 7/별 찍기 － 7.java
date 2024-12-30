import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int counter = 0;
        boolean flag = false;

        for (int i = 0; i < 2 * n-1; i++) {
            if (flag == true) {
                counter--;
                counter--;
            }
            counter++;
            if (!flag && counter == n) {
                flag = true;
            }
            String space = " ";
            String star = "*";

            for (int j = 0; j < n - counter; j++) {
                System.out.print(space);
            }
            for (int k = 0; k < 2 * counter - 1; k++) {
                System.out.print(star);
            }
            System.out.println();
        }
        // 개쓰레기코드같은데?
    }
}