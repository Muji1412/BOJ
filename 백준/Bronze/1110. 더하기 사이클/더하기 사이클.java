import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;
        int number = n;


        int temp = 0;
        while (true) {
            int a = number / 10;
            int b = number % 10;

            int sum = a + b;

            number = b * 10 + sum % 10;

            count++;

            if (number == n) {
                break;
            }
        }
        System.out.println(count);
    }
}
