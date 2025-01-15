import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println(fivo(sc.nextInt()));

    }
    public static int fivo(int n) {
        // n이 17이라고 가정
        // fivo 17 넣는다고 하면, 계속 더해줘야함
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fivo(n - 1) + fivo(n - 2);
        }
    }
}
