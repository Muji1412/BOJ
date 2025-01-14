import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashMap<String,Integer> map = new HashMap<>();

        while (n-- > 0) {
            map.clear();
            int clothesCount = Integer.parseInt(br.readLine());
            while (clothesCount-- > 0) {
                String bodyPart = br.readLine().split(" ")[1];
                if (map.containsKey(bodyPart)) {
                    map.put(bodyPart, map.get(bodyPart) + 1);
                } else {
                    map.put(bodyPart,1);
                }
            }

            // 2번째 토큰을 맵에서 체크해서 없는 경우에는 부위, 1 넣어주고
            //            맵에서 체크해서 있는 경우에는 부위, +1해서 다시 넣어주기

            int clothesSum = 1;

            if (map.size() == 1) {
                for (String key : map.keySet()) {
                    clothesSum = map.get(key);
                }
            } else {
                for (String key : map.keySet()) {
                    clothesSum *= map.get(key) + 1;
                }
                clothesSum--;
            }

            System.out.println(clothesSum);




        }
    }
}
