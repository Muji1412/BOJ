import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int s3 = scanner.nextInt();


        // 최대 가능성
        int[] arr = new int[s1 + s2 + s3 + 1];

        for (int i = 1; i <= s1; i++) {
            for (int j = 1; j <= s2; j++) {
                for (int k = 1; k <= s3; k++) {
                    int sum = i + j + k;
                    arr[sum]++;
                }
            }
        }

        int max = 0;
        for (int i = 0; i <= s1 + s2 + s3; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i <= s1 + s2 + s3; i++) {
            if (arr[i] == max) {
                System.out.println(i);
                break;
            }
        }
    }
}
