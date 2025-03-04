import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if(check(i)){
                count++;
            }
        }

        System.out.println(count);


    }
    static boolean check(int n) {
        if (n<100) {
            return true;
        }

        if (n == 1000) {
            return false;
        }


        // 최대 주어지는 수 999이므로 100~999까지 비교 메서드

        int a = n % 10;
        n /=10;
        int b = n % 10;
        n /=10;
        int c = n % 10;

        // a = 1의자리, b는 10의자리, c는 100의자리

        if (a - b == b - c) {
            return true;
        } else {
            return false;
        }
    }
}
