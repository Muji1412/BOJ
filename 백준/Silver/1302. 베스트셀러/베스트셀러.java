import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<String,Integer> map = new HashMap<>();

        int max = 0;
        String temp = "";

        if (n == 1) {
            temp = sc.next();
            System.out.println(temp);
            return;
        }

        while (n-- > 0) {
            String s = sc.next();
            map.put(s, map.getOrDefault(s, 0) + 1);

            if (map.get(s) > max) {
                max = map.get(s);
                temp = s;

            } else if (map.get(s) == max) {
                if (s.compareTo(temp) < 0) {
                    temp = s;
                }
            }
        }

        System.out.println(temp);
    }
}
