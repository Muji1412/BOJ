import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Queue<Integer> Q = new LinkedList<>();
        Queue<Integer> save = new LinkedList<>();

        for (int i = 1; i <= a; i++) {
            Q.add(i);
        }
        while (!Q.isEmpty()) {
            for (int i = 1; i < b; i++) {
                int polled = Q.poll();
                Q.add(polled);
            }
            int polled = Q.poll();
            save.add(polled);
        }

        Object[] saves = save.toArray();

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < saves.length; i++) {
            sb.append(saves[i]);
            if (i < saves.length - 1) {
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb);


        
    }
}
