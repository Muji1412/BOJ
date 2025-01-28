import java.util.Scanner;

public class Main {
    static char[] str;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        while (sc.hasNext()) {
            int n = sc.nextInt();
            int len = (int) Math.pow(3, n);

            StringBuilder sb = new StringBuilder();

            str = new char[len];
            for (int i = 0; i < len; i++) {
                str[i] = '-';
            }

            cantor(0, len - 1);



            for (char c : str) {
                sb.append(c);
            }
            System.out.println(sb);
        }


    }

    public static void cantor(int start, int end) {
        if (start >= end) {
            return;
        }

        int len = end - start + 1;
        int third = len / 3;

        for (int i = start + third; i < start + 2 * third; i++) {
            str[i] = ' ';
        }

        cantor(start, start + third - 1);
        cantor(start + 2 * third, end);
    }
}
