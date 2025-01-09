import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] coins = new int[n];
        for (int i = n-1; i >= 0; i--) {
            coins[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (k / coins[i] > 0) {
                int temp = 0;
                temp = k / coins[i];
                count += temp;
                k %= coins[i];
            }
        }

        System.out.println(count);


    }
}
