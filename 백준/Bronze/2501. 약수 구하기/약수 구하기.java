import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int numis = 0;
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;
                numis = i;
                if (counter == k) {
                    System.out.println(numis);
                }
            }
            if (i == n && counter < k) {
                System.out.println("0");
            }
        }
    }
}
