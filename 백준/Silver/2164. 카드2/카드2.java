import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Queue<Integer> q = new LinkedList<Integer>();

//        System.out.println(q.size());

        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        while (q.size() != 1) {
            q.poll();
            if (q.size() != 1) {
                int temp = q.poll();
                q.add(temp);
            }
        }

        System.out.println(q.peek());

    }
}
