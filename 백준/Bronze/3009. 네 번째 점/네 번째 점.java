import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int mainX;
        int mainY;

        int ax = scanner.nextInt();
        int ay = scanner.nextInt();

        int bx = scanner.nextInt();
        int by = scanner.nextInt();

        int cx = scanner.nextInt();
        int cy = scanner.nextInt();

        if (ax == bx) {
            ax = 0;
            bx = 0;

        } else if (ax == cx) {
            ax = 0;
            cx = 0;

        } else if (bx == cx) {
            bx = 0;
            cx = 0;
        }

        if (ay == by) {
            ay = 0;
            by = 0;

        } else if (ay == cy) {
            ay = 0;
            cy = 0;

        } else if (by == cy) {
            by = 0;
            cy = 0;
        }

        mainX = ax + bx + cx;
        mainY = ay + by + cy;

        System.out.println(mainX + " " + mainY);



    }
}
