import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int start = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            // 로직 예시
//            [1] 2 3 4 2
//            [1, 2] 3 4 2
//            [1, 2, 3] 4 2
//            [2, 3, 4] 2 투포인터로 양옆을 잘라주는 역할을 해줌
            while (sum > m && start < i) {
                sum -= arr[start];
                start++;
            }

            if (sum == m) {
                count++;
            }

        }

        System.out.println(count);



//        for (int i = 0; i < n; i++) {
//            int sum = 0;
//            left = i;
//            idx = i;
//            for (int j = left; j<idx; j++) {
//                sum += arr[j];
//            }
//
//        }
    }
}
