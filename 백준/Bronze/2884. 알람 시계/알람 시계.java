import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int min = (a * 60) + b-45;

        if (min >= 0) {
            a = min / 60;
            b = min % 60;
        } else {
            int daybefore = 1440+min;
            a = daybefore / 60;
            b = daybefore % 60;
        }
        System.out.print(a + " " + b);
    }
}
