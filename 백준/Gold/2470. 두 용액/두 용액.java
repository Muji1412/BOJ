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
        Arrays.sort(arr);


        int left = 0;
        int right = n-1;

        int leftSave = 0;
        int rightSave = 0;

        int min = Integer.MAX_VALUE;
        // 더해서 비교해서 달라지면 바꾸기
        // 0에 가까워져야 하니까, 0보다 커지면 왼쪽으로, 0보다 작아지면 오른쪽으로 옮기기
        while (left < right) {
            int a = arr[left] + arr[right];

            int abs = Math.abs(a);
            if (abs < min) {
                min = abs;
                leftSave = arr[left];
                rightSave = arr[right];
            }
            if (a == 0) {
                leftSave = arr[left];
                rightSave = arr[right];
                break;
            } else if (a > 0) {
                right--;
            } else if (a < 0) {
                left++;
            }

        }
        System.out.println(leftSave + " " + rightSave);
    }
}
