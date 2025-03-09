import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            deque.addLast(i);
        }

        StringBuilder sb = new StringBuilder();

        sb.append("<");

        while (!deque.isEmpty()) {
            // k-1번 반복하고, 마지막 나온값 sb에 추가하기
            int temp = k-1;
            while (temp-- > 0) {
                int a = deque.pollFirst();
                deque.addLast(a);
            }
            int poll = deque.pollFirst();
            sb.append(poll).append(", ");

        }

        int len = sb.length();
        if (len > 0) {
            sb.deleteCharAt(len - 1);
            sb.deleteCharAt(len - 2);
        }

        sb.append(">");

        System.out.println(sb);
    }
}
