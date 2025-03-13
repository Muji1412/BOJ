import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

        // 배열 만들고 각각 받기

        int[] scores = new int[N];
        int[] queries = new int[Q];


        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextInt();
        }
        for (int i = 0; i < Q; i++) {
            queries[i] = sc.nextInt();
        }

        int[][] timeIntervals = new int[N][2];
        int currentTime = 0;

        for (int i = 0; i < N; i++) {
            timeIntervals[i][0] = currentTime;
            timeIntervals[i][1] = currentTime + scores[i] - 1;
            currentTime += scores[i];
        }

        for (int query : queries) {
            for (int i = 0; i < N; i++) {
                if (timeIntervals[i][0] <= query && query <= timeIntervals[i][1]) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}
