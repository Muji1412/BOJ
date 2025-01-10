import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[41];

        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < 41; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
//            System.out.println(arr[i]);
        }

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            int a = Integer.parseInt(br.readLine());
            if (a == 0) {
                System.out.println("1 0");
            } else if (a == 1) {
                System.out.println("0 1");
            } else {
                System.out.println(arr[a-1] + " " + arr[a]);
            }
        }
    }

}
