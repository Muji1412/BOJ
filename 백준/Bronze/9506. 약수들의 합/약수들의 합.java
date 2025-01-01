import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            int n = scanner.nextInt();
            if (n == -1) {
                break;
            }

            // sum값 체크해서
            int diviCounter = 0;
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    diviCounter++;
                    sum += i;
                }
            }

            int diviCounter2 = 0;
            if (sum == n) {
                System.out.print(n + " = ");
                for (int i = 1; i < n; i++) {
                    if ( n % i == 0) {
                        System.out.print(i);
                        diviCounter2++;
                        if (diviCounter2<diviCounter) {
                            System.out.print(" + ");
                        }
                    }
                }
            } else {
                System.out.print(n + " is NOT perfect.");
            }
            System.out.println();
        }
    }
}