import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n == 1) {

        }

        //소인수분해
        // n이 1이면 출력X
        // for문으로 돌리고, 1부터 72까지 돌림. 단, 계속 나눈 값이 1이 되면 break

        StringBuilder sb = new StringBuilder();
        int temp =n;

        for (int i = 2; i <= n; i++) {

            // 소인수분해 하려면 약수여야하므로 0 조건
            // while문으로 돌려야함

            while (temp % i == 0) {
                sb.append(i).append("\n");
                temp = temp/i;
            }
            if (temp == 1) {
                break;
            }
        }
//        sb.delete
        if (sb.length()>0) {
            sb.deleteCharAt(sb.length() - 1);
            System.out.println(sb);
        }
    }
}
