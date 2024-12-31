import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int n = 0;
        int sum = 0;

        // 분수 적는용
        int d = 0;
        int b = 0;
        int temp = 0;

        while (sum < a) {
            if (sum + n + 1 >= a) {
                temp = sum;
            }
            n += 1;
            sum += n;
//
//            System.out.println("n = " + n);
//            System.out.println("sum = " + sum);
//            System.out.println("temp = " + temp);
        }

        // n 짝홀따라 시작위치 달라짐

        int comp = a - temp;

        if (n % 2 == 0) {
            d = comp;
            b = n - comp + 1;
        } else if (n % 2 == 1) {
            d = n - comp + 1;
            b = comp;
        }

        System.out.println(d + "/" + b);

    }
}
