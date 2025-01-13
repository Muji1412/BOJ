import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        Deque <Integer> deque = new ArrayDeque<>();
        Deque <Integer> ballon = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            deque.add(Integer.parseInt(st.nextToken()));
            ballon.add(i);
        }

        StringBuilder sb = new StringBuilder();

        while (!deque.isEmpty()) {

            int move = deque.pollFirst();
            int index = ballon.pollFirst();

            sb.append(index).append(" ");

            if (deque.isEmpty()) break;

            if (move > 0) {
                for (int i = 1; i < move; i++) {
                    deque.addLast(deque.pollFirst());
                    ballon.addLast(ballon.pollFirst());
                }
            } else if (move < 0) {
                for (int i = 0; i < Math.abs(move); i++) {
                    deque.addFirst(deque.pollLast());
                    ballon.addFirst(ballon.pollLast());
                }
            }
        }

        System.out.println(sb);
    }

}
