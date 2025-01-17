import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int S = 0;
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        StringBuilder sb=new StringBuilder();

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if (s.equals("all")) S = (1 << 21) - 1;// 명령이 1개일 때에는 중괄호를 붙혀주지 않아도 정상 작동
            else if (s.equals("empty")) S = 0;
            else {
                int number = Integer.parseInt(st.nextToken());
                if (s.equals("add")) {
                    S |= (1 << number);
                } else if (s.equals("remove")) {
                    S &= ~(1 << number);
                } else if (s.equals("check")) {
                    boolean cont = (S & (1 << number)) != 0;
                    if (cont) {
                        sb.append("1").append('\n');
                    } else {
                        sb.append("0").append('\n');
                    }
                } else if (s.equals("toggle")) {
                    boolean cont = (S & (1 << number)) != 0;
                    if (cont) {
                        S &= ~(1 << number);
                    } else {
                        S |= (1 << number);
                    }
                }

            }
        }
        System.out.println(sb);

    }
}
