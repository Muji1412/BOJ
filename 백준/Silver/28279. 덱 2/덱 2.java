import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> deque = new ArrayDeque<Integer>();

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String s = br.readLine();

            if (s.startsWith("1")) {
                int num = Integer.parseInt(s.split(" ")[1]);
                deque.addFirst(num);

            } else if (s.startsWith("2")) {
                int num = Integer.parseInt(s.split(" ")[1]);
                deque.addLast(num);
            } else if (s.equals("3")) {
                if (deque.isEmpty()) {
                    System.out.println("-1");
                } else {
                    int num = deque.pollFirst();
                    System.out.println(num);
                }
            } else if (s.equals("4")) {
                if (deque.isEmpty()) {
                    System.out.println("-1");
                } else {
                    int num = deque.pollLast();
                    System.out.println(num);
                }
            } else if (s.equals("5")) {
                System.out.println(deque.size());
            } else if (s.equals("6")) {
                if (deque.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (s.equals("7")) {
                if (deque.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(deque.peekFirst());
                }
            } else if (s.equals("8")) {
                if (deque.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(deque.peekLast());
                }

            }

        }

    }


}
