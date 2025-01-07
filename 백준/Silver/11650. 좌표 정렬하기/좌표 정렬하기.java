import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int point[][] = new int[n][2];

        for (int i = 0; i < n; i++) {
            point[i][0] = scanner.nextInt();
            point[i][1] = scanner.nextInt();
        }

        Arrays.sort(point, (e1, e2) ->{
            if (e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });


        for (int i = 0; i < n; i++) {
            System.out.println(point[i][0] + " " + point[i][1]);
        }

    }
}
