import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] A = new int[n];
        int[] B = new int[n];

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st1.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            B[i] = Integer.parseInt(st2.nextToken());
        }

        int M = Integer.parseInt(br.readLine());



        StringTokenizer st3 = new StringTokenizer(br.readLine());
        int[] arr = new int[M];
        for (int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(st3.nextToken());
        }

        Deque<Integer> que = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            if (A[i] == 0) {
                que.addFirst(B[i]);
            }

        }



        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < M; i++) {
            que.add(arr[i]);
            sb.append(que.pollFirst() + " ");
        }


        System.out.println(sb);




    }
}
