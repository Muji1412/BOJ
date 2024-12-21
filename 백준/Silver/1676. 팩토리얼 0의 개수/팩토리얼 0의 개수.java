import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long F = 1L;
        int answer = 0;


        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                answer++;
            }
            if (i % 25 == 0) {
                answer++;
            }
            if (i % 125 == 0) {
                answer++;
            }
//            F = F * i;
//            System.out.print("i = " + i + "까지 갈 때, 팩토리얼 값: ");
//            System.out.println(F);

        }
        System.out.println(answer);
    }
}
