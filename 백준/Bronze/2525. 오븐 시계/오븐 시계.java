import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int time = scanner.nextInt();

        int M = m + time;
        int min = M;
        if (M >= 60) {
            h = h + (M / 60);
            min = M % 60;
        }

        if (h >= 24) {
            h = h - 24;
        }
        System.out.print(h);
        System.out.print(" ");
        System.out.println(min);
    }
}