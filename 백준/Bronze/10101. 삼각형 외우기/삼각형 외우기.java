import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        String triangle = "null";

        if (a + b + c != 180) {
            triangle = "Error";
        }

        if (a + b + c == 180) {
            if (a == 60 && b == 60 && c == 60) {
                triangle = "Equilateral";
            } else if (a == b || a == c || b == c) {
                triangle = "Isosceles";
            } else if (a != b && a != c && b != c) {
                triangle = "Scalene";
            }
        }



        System.out.println(triangle);
    }
}
