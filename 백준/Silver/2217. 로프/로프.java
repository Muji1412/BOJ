import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            maxValue = Math.max(maxValue, arr[i]);
        }

        Arrays.sort(arr);

       
        int maxValue2 = Integer.MIN_VALUE;
        // 10 20 35 30 - 정답은 60

        
        int minNow = 0;
        for (int i = 0; i < n; i++) {
            minNow = arr[arr.length - 1 - i];

            maxValue2 = Math.max(maxValue2, minNow * (i + 1));
        }

        System.out.println(maxValue2);



    }
}
