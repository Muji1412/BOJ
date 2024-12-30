import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int h;
        int w;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (c % a == 0) {
                h = a;
                w = c / a;
            } else {
                h = c % a;
                w = c / a + 1;
            }
            

            if (w > 9) {
                System.out.print(h);
                System.out.println(w);
            } else {
                System.out.println(h + "0" + w);
            }
        }
    }

}
