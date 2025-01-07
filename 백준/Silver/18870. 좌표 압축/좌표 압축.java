import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        // 배열 2개필요함, 같은걸로
        int[] arr = new int[n];
        int[] arrCopy = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            arrCopy[i] = arr[i];
        }

        // 배열 하나만 정렬시키기
        Arrays.sort(arrCopy);

        // 키 - 값 용 해시맵 생성
        HashMap<Integer, Integer> map = new HashMap<>();
        // 카운터 = 지금 몇번째 큰 수인지 카운팅해줌
        int counter = 0;
        for (int value : arrCopy) {
                // 키가 없어야지만 작동해야함, 1000, 999, 1000, 999 이렇게 있을때, 1000 두번 저장되면 안됨
            if (!map.containsKey(value)) {
                // 현재 value와 카운터값을 맵에 지정해줌
                map.put(value,counter);
                // 다음에 들어가야할 카운터 늘려줌
                counter++;
            }
        }
        StringBuilder sb = new StringBuilder();

        for (int value : arr) {
            sb.append(map.get(value)).append(" ");
        }


        System.out.println(sb);

    }
}
