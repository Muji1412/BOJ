import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        int counter = 0;

        // 이중 for 문
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (arr[i] + arr[j] == x) {
//                    counter++;
//                }
//            }
//        }

        // 투포인터로 풀기
        Arrays.sort(arr);


        int left = 0;
        int right = n - 1;

        // 좌, 우가 왔다갔다해주면서

        while (left < right) {
            if (arr[left] + arr[right] == x) {
                counter++;
                left++;
                right--;
                // 일치할때는 각각 앞뒤로
            } else if (arr[left] + arr[right] < x) { // 값이 크면 왼쪽을 키워서 서치
                left++;
            } else { // 값이 작으면 오른쪽을 낮춰서 서치
                right--;
            }
        }

        System.out.println(counter);
    }
}
