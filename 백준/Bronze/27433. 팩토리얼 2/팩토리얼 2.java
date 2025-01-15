import java.util.Scanner;

public class Main {
    static long sum = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        factorial(sc.nextInt());
        if (sum == 0) {
            System.out.println("1");
            return;
        }
        System.out.println(sum);
    }

    static void factorial(int n) {
        sum = sum * n;
        if (n > 1) {
            factorial(n - 1);
        }
    }
}
