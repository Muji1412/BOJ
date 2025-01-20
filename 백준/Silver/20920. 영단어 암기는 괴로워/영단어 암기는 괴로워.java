import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();

        while (n-- > 0) {
            String s = br.readLine();
            if (s.length() >= m) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }

//        for (String s : map.keySet()) {
//            System.out.println(s + " " + map.get(s));
//        }

        List<String> list = new ArrayList<>(map.keySet());

        Collections.sort(list, new Comparator<String>() {
            public int compare(String o1, String o2) {
                // 1. 빈도수
                // 2. 길이가 긴 순서대로
                // 3. 사전순으로
                if (map.get(o1) != map.get(o2)) {
                    return map.get(o2) - map.get(o1);
                }
                if (o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                } else {
                    return o1.compareTo(o2);
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);

    }
}
