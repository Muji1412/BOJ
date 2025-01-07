import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

        // 상근이 카드 덱 만들기
        int n = Integer.parseInt(br.readLine());
        int[] cards = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        //대조용 해시맵 생성
        HashMap<Integer, Integer> map = new HashMap<>();
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] cards2 = new int[m];
        for (int i = 0; i < m; i++) {
            String a = st2.nextToken();
            cards2[i] = Integer.parseInt(a);
            map.put(Integer.parseInt(a), 0);
        }

        for (int i = 0; i < n; i++) {
            if (map.containsKey(cards[i])) {
                int count = map.get((cards[i]));
                    count++;
                    map.put(cards[i], count);
            }
        }


        StringBuilder sb = new StringBuilder();

        for (int value : cards2) {
            sb.append(map.get(value)).append(" ");
        }

        System.out.println(sb);



    }
}
