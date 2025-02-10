import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while (n-- > 0) {
            for (int i = n; i >= 0; i--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
