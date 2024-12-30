import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String idddd = br.readLine();

        String[] input = idddd.split("");

        int flag = 1;

        for (int i = 0; i < input.length / 2; i++) {
            if (input[i].equals(input[input.length - i - 1])) {
                flag = 1;
            } else {
                flag = 0;
                // 플래그값 0으로 바뀐 뒤 for문 더 안돌아가게 만듬
                break;
            }
        }
        System.out.println(flag);
    }
}
