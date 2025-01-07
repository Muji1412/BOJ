import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 상근이 카드를 해시맵으로 만들어줘야함

        int n = scanner.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(scanner.nextInt(),1);
        }

        // 대조카드 어레이
        int m = scanner.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            arr[i] = a;
            if (!map.containsKey(a)) {
                map.put(a,0);
            }
        }



        StringBuilder sb = new StringBuilder();

        for (int value : arr) {
            sb.append(map.get(value)).append(" ");
        }


        System.out.println(sb);


    }
}
