import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String[] arr = new String[N];

        scanner.nextLine();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextLine();

        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // 단어 길이가 같다면
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                // 이외의 케이스
                else {
                    return s1.length() - s2.length();
                }

            }
        });

        StringBuilder sb = new StringBuilder();

        // 반복문 제거해야하는데, 첫번째 문장은 반드시 나가야하니까 출력

        sb.append(arr[0]).append('\n');

        // 첫번째 단어 있으므로 1부터 시작

        for (int i = 1; i < N; i++) {
            if (!arr[i].equals(arr[i-1])) {
                sb.append(arr[i]).append('\n');
            }
        }
        System.out.println(sb);

    }
}
