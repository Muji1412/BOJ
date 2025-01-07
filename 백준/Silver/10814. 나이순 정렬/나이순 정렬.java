import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String[][] arr = new String[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = scanner.next();
            arr[i][1] = scanner.next();
        }

        Arrays.sort(arr, (e1, e2) -> {

            // 스플릿 해줄필요 없이 애초에 처음부터 2차원 배열로 받았으므로, e1[0] 값 불러와서 정수 변환만 시켜주기
            int num1 = Integer.parseInt(e1[0]);

            int num2 = Integer.parseInt(e2[0]);


            return num1 - num2;

        });

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

    }
}
