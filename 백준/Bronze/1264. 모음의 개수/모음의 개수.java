import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String s = br.readLine();

            if (s.equals("#")) {
                break;
            }

            String ss = s.toUpperCase();

            char[] arr = ss.toCharArray();

            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 'A') {
                    sum++;
                }else if (arr[i] == 'E') {
                    sum++;
                }else if (arr[i] == 'I') {
                    sum++;
                }else if (arr[i] == 'O') {
                    sum++;
                } else if (arr[i] == 'U') {
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
