import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 상근이 카드를 해시맵으로 만들어줘야함

        int n = scanner.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(scanner.nextInt(),1);
        }

        // 대조카드 어레이
        int m = scanner.nextInt();

        // 이 부분이 통째로 필요가 없음
//        int[] arr = new int[m];
//        for (int i = 0; i < m; i++) {
//            int a = scanner.nextInt();
//            arr[i] = a;
//            if (!map.containsKey(a)) {
//                map.put(a,0);
//            }
//        }



        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            // 이 부분을 getOrDefault(value,0) 으로 바꿔주면, 일치하는 경우에는 키값을 가져오고 아닌경우에는 0을 디폴트로 출력
            int value = scanner.nextInt();
            sb.append(map.getOrDefault(value,0)).append(" ");
        }

        System.out.println(sb);

    }
}
