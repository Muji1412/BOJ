import java.util.Scanner;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 필요한거 - n개, 1,2,3번 기둥 넣었을때
        // 2^n - 1 -> 이동 횟수
        System.out.println((int) Math.pow(2, n) - 1);
        Hanoi(n, 1, 3, 2 );

        System.out.println(sb);
    }
    // 하노이의 탑 재귀 알고리즘
    public static void Hanoi(int n, int start, int end, int temp) {
        if (n == 1) {
            sb.append(start + " " + end).append("\n");
            return;
        }

        Hanoi(n - 1, start, temp, end);
        sb.append(start + " " + end).append("\n");
        Hanoi(n - 1, temp, end, start);
    }
}

