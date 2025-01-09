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

        int sum = 0;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            temp += arr[i];
            sum += temp;

        }

        System.out.println(sum);
    }
}
