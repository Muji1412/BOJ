import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;

        HashSet<String> set = new HashSet<>();
        while (n-- > 0) {
            String str = br.readLine();
            if (str.equals("ENTER")) {
                set.clear();
            } else if (!set.contains(str)) {
                set.add(str);
                count++;
            }
        }

        System.out.println(count);

    }
}
