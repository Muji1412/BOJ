import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> setD = new HashSet<>();
        HashSet<String> result = new HashSet<>();

        for (int i = 0; i < n; i++) {
            setD.add(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            String a = br.readLine();
            if (setD.contains(a)) {
                result.add(a);
            }
        }

        String[] arr =result.toArray(new String[0]);
        Arrays.sort(arr);
        System.out.println(arr.length);
        for (String s : arr) {
            System.out.println(s);
        }



    }
}
