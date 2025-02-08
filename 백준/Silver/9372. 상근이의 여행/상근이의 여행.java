import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            //국가의 수 N(2 ≤ N ≤ 1 000)과 비행기의 종류 M
            int n = sc.nextInt();
            int m = sc.nextInt();


            //생각해보면, 애초에 그냥 항상 n-1값이 정답임

            while (m-- > 0) {
                int c = sc.nextInt();
                int d = sc.nextInt();
            }

            System.out.println(n - 1);
        }
    }
}
