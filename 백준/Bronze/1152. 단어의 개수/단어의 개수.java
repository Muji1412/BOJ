import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int count = 0;
        int l = input.length();

        for (int i = 0; i < input.length(); i++) {
            // 자바에서 ' 이거는 char타입
            if (input.charAt(i) == ' ') {
                count++;
            }
        }
        if (input.charAt(0) == ' ') {
            count--;
        }
        if (input.charAt(l-1) == ' ') {
            count--;
        }
            System.out.println(count+1);
    }
}
