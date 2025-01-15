import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int sum = 0;

        int n = Integer.parseInt(br.readLine());
        int amount = n;
        int[] arr = new int[n];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        //산술평균 : N개의 수들의 합을 N으로 나눈 값
        //중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
        //최빈값 : N개의 수들 중 가장 많이 나타나는 값
        //범위 : N개의 수들 중 최댓값과 최솟값의 차이

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            // 중앙값용 어레이
            arr[i] = num;

            // 산술평균용 sum
            sum += num;

            // 범위용 민/맥스밸류
            minValue = Math.min(minValue, num);
            maxValue = Math.max(maxValue, num);

            // 최빈값용 해시맵 저장
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }


//        System.out.println("산술평균");
        if (sum % amount == 0) {
            System.out.println(sum / amount);
        } else {
            double avg = (double) sum / amount;
            System.out.println((int) Math.round(avg));
        }
//        System.out.println("중앙값");
        Arrays.sort(arr);
        System.out.println(arr[amount / 2]);

//        System.out.println("최빈값");

        int count = 0;
        for (var entry : map.entrySet()) {
            count = Math.max(count, map.get(entry.getKey()));
        }
        //count값은 많이 나온게 몇번인지 알려줌
        HashSet<Integer> set = new HashSet<>();
        for (int key : map.keySet()) {
            int a = map.get(key);
            if (a == count) {
                set.add(key);
            }
        }

        Integer[] array = set.toArray(new Integer[0]);

        Arrays.sort(array);
        if (array.length > 1) {
            System.out.println(array[1]);
        }else {
            System.out.println(array[0]);
        }



        //셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.

        //키 밸류에서 밸류에서 가장 높은값 = ?


//        System.out.println("범위");
        System.out.println(maxValue - minValue);

    }
}
