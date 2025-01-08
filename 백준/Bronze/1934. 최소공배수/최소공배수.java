import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int ab = a*b;

            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }

            System.out.println(ab/a);
        }
    }
}
