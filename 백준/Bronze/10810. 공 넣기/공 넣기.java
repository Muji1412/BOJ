import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] box = new int[n];
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            for (int j = a-1; j <b; j++) {
                box[j] = c;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(box[i] + " ");
        }
    }
}