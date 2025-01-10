import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        map.put(1, 0);

        for (int i = 2; i <= a; i++) {


            // 가장 작은값 세개를 만들어서 비교해서 가장 작은놈 넣어줌

            int mincount = map.get(i - 1) + 1;

            if (i % 3 == 0) {
                mincount = Math.min(mincount, map.get(i / 3) + 1);
            }

            if (i % 2 == 0) {
                mincount = Math.min(mincount, map.get(i / 2) + 1);
            }



            map.put(i, mincount);

        }

        System.out.println(map.get(a));
    }
}
