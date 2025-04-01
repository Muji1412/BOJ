import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put(i, 0);
        }


        // 맵에 넣어주고, 마지막에 9의 숫자개수를 6에 부어줌, 이후 /2해줌
        // 그러면 어떻게되냐.. 6-9가 총 9개일때, 4.5가 나오고, 5개가 필요함. 라운드해주면 되나?
        while (n != 0) {
            int temp = n % 10;
            n /= 10;
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }

        int sixCounter = map.get(6);
        int nineCounter = map.get(9);

        map.put(6, 0);
        map.put(9, 0);

        double sixNine = sixCounter + nineCounter;

        double tempDouble = sixNine / 2.0;
        int tempInt = (int) Math.round(tempDouble);



        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            int a = map.get(i);
            max = Math.max(max, a);
        }

        max = Math.max(max, tempInt);
        System.out.println(max);
    }
}
