import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
           String input=br.readLine();
           String[] s = input.split("");
           int count = 0;
            for (int j = 0; j < input.length(); j++) {
                if (s[j].equals("(")) {
                    count++;
                } else if (s[j].equals(")")) {
                    count--;
                    if (count < 0) {
                        break;
                    }
                }
            }
            if (count == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
