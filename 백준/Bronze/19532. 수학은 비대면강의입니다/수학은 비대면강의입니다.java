import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int E = scanner.nextInt();
        int F = scanner.nextInt();

        int tempX = 0;
        int tempY = 0;

        int ansX = 0;
        int ansY = 0;

        for (int x = -999; x < 1000; x++) {
            for (int y = -999; y < 1000; y++) {
                if (A * x + B * y == C) {
                    tempX = x;
                    tempY = y;
                    if (D * tempX + E * tempY == F) {
                        ansX = tempX;
                        ansY = tempY;
                        System.out.println(ansX + " " + ansY);
                        return;
                    }
                }
            }
        }
    }
}
