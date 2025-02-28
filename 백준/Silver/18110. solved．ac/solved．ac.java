import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 15퍼센트의 값이 나오면, 그 값을 반올림해서 사용함

        // 25명의 경우, 0.15를 곱하면 3.75명인데, 반올림을 사용해 4명으로 카운트, 위에서 4명, 아래에서 4명을 세지 않음

        int temp = (int)Math.round(n * 0.15);

        int[] arr = new int[n];

        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr); //아래에서부터 temp명, 위에서부터 temp명 끊어야하는데, 정렬이 필수


//        for (int i = temp; i < n-temp; i++) { // 해당하는 인원들의 점수들만 넣어줌
//            sum += arr[i];
//
//
//            // 시간초과날듯?
//        }

        for (int i = 0; i < temp; i++) {
            sum -= arr[i];
        }
        for (int i = arr.length - 1; i >= arr.length-temp; i--) {
            sum -= arr[i];
        }

        // sum을 구해주는 과정을, 처음에 받을때 먼저 sum에 같이 받고, 이후 상위, 하위 15퍼센트의 값들만 빼서 계산






        double avg = (double) sum / (n-temp*2);

        int rounded = (int) Math.round(avg);

        System.out.println(rounded);
    }
}
