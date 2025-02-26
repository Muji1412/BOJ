import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        st=new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr= new int[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE;

        // 투 포인터 + 슬라이딩,
        // 시작 left값은 0, right값은 k-1

        int left = 0;
        int right = K;

        int temp = 0;
        for (int i = 0; i < K; i++) {
            temp+=arr[i];
        }
        max=Math.max(max,temp);

        // 현재 초기값 설정됨

        while (left < (N - K)) {
            // left값을 빼고, right값을 더해줌
            temp-=arr[left];
            left++;
            temp+=arr[right];
            right++;
            max=Math.max(max, temp);

        }

        System.out.println(max);




    }
}
