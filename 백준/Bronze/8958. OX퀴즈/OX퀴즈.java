import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            System.out.println(oxSum(br.readLine()));
        }
    }

    public static int oxSum(String a) {
        String[] arr = a.split("");

        int sum = 0;
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("O")) {
                n++;
                sum += n;
            }
            if (arr[i].equals("X")) {
                n=0;
            }
        }
        return sum;
    }
}
