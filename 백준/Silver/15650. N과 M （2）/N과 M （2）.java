import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int n, m;
    static List<Integer> result = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        back(1);

    }
    public static void back(int num) {
        if (result.size() == m) {
            for (int val : result) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for (int i = num; i <= n; i++) {
            result.add(i);
            back(i + 1);
            result.remove(result.size() - 1);
        }
    }
}
