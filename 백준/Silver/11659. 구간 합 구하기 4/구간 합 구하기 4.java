import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());

        int[] arr = new int[n+2];

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        arr[0] = 0;
        arr[1] = 0;
        arr[2]  = Integer.parseInt(st2.nextToken());

        for (int i = 3; i < arr.length; i++) {
            arr[i] = arr[i-1] + Integer.parseInt(st2.nextToken());
        }


        StringBuilder sb = new StringBuilder();

        while (m-- > 0) {
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st3.nextToken());
            int j = Integer.parseInt(st3.nextToken());

            // 12 9 1 나와야함
            // 1 3  ->
            // 2 4
            // 5 5
            // arr 2 - 0 (0이면 안해야함)
            // arr 3 - arr 1
            // arr 4 - arr 3
            // i는 -1해주고 j는 -2해준다음에 i를 놓고 j를 빼줘야함

            int sum = arr[j+1] - arr[i];
            sb.append(sum).append("\n");

        }
        System.out.println(sb);


    }
}
