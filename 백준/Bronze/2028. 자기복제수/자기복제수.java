import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int b = n * n;

            int d = 1;
            int temp = n;
            while (temp >= 10) {
                temp /= 10;
                d *= 10;
            }

            int last = b % (d * 10);

            if (last == n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
