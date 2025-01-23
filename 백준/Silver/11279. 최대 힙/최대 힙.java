import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> Pqueue = new PriorityQueue<>((o1, o2) -> o2 - o1);

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        while (n-- > 0) {
            int a = sc.nextInt();
            if (a == 0) {
                if (Pqueue.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(Pqueue.poll());
                }
            } else {
                Pqueue.offer(a);
            }
        }
    }
}
