import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = changer(scanner.nextInt());
        int b = changer(scanner.nextInt());

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public static int changer(int a) {
        int a1 = a % 10;
        int a10 = (a % 100 - a1) / 10;
        int a100 = (a % 1000 - a10 - a1) / 100;
        return a1 * 100 + a10 * 10 + a100;
    }
}
