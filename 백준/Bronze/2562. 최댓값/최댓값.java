import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int whereIsMax = 0 ;
        int max ;
        int n = 9;
        int[] nums = new int[n];

        // 입력값들 받는 파트
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        //최대값 찾기
        max = nums[0];
        for (int i = 0; i < n; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
            if (nums[i]==max) {
                whereIsMax = i+1;
            }
        }
        System.out.println(max);
        System.out.println(whereIsMax);
    }
}