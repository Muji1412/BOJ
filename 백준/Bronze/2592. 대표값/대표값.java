import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Integer> map = new HashMap<>();

        int n = 10;
        int sum = 0;
        int highest = 0;
        int value = 0;
        while (n-- > 0) {
            int a = sc.nextInt();
            sum += a;
            map.put(a, map.getOrDefault(a, 0) + 1);
            if (map.get(a) > highest) {
                highest = map.get(a);
                value = a;
            }
        }

        System.out.println(sum / 10);
        System.out.println(value);


    }
}
