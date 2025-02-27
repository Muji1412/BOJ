import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //첫 번째 줄에 민호가 임의로 만든 DNA 문자열 길이 |S|와 비밀번호로 사용할 부분문자열의 길이 |P| 가 주어진다

        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        String DNA = br.readLine();

        //문자열에 포함되어야 할 {‘A’, ‘C’, ‘G’, ‘T’} 의 최소 개수가 공백을 구분으로 주어진다.

        st = new StringTokenizer(br.readLine());

        int Amin = Integer.parseInt(st.nextToken());
        int Cmin = Integer.parseInt(st.nextToken());
        int Gmin = Integer.parseInt(st.nextToken());
        int Tmin = Integer.parseInt(st.nextToken());

        char[] charArr = DNA.toCharArray();



        int count = 0;

        // 시작 left 인덱스는 0, right 인덱스는 p-1
        // 해서, 슬라이드를 해주는데.. 흠 생각해보니까 그냥 매번 세는거보다 prefixed sum 해주는게 좋지않냐?
        // 일단 a c g t 네개로 테스트


        int[] countArr = new int[5];

        // A = 1, C = 2, G = 3, T = 4


        //첫번째 만들기
        for (int i = 0; i < p; i++) {
            char c = charArr[i];
            if (c == 'A') {
                countArr[1]++;
            }else if (c == 'C') {
                countArr[2]++;
            } else if (c == 'G') {
                countArr[3]++;
            } else if (c == 'T') {
                countArr[4]++;
            }
        }

        // 이후 슬라이딩 해주면서 왼쪽값 빼주고, 오른쪽값 더해주기
        // 시작은 1에 해당하는 인덱스 빼주고, p에 해당하는거 빼주기-> 반복하기.

        if (countArr[1]>=Amin && countArr[2]>=Cmin && countArr[3]>=Gmin && countArr[4]>=Tmin) {
            count++;
        }
        int left = 0;
        int right = p;

        while (true) {
            if (right == s) {
                break;
            }
            char leftC = charArr[left];
            char rightC = charArr[right];

            if (leftC == 'A') {
                countArr[1]--;
            } else if (leftC == 'C') {
                countArr[2]--;

            } else if (leftC == 'G') {
                countArr[3]--;

            } else if (leftC == 'T') {
                countArr[4]--;
            }

            if (rightC == 'A') {
                countArr[1]++;
            } else if (rightC == 'C') {
                countArr[2]++;
            } else if (rightC == 'G') {
                countArr[3]++;
            } else if (rightC == 'T') {
                countArr[4]++;
            }
            if (countArr[1]>=Amin && countArr[2]>=Cmin && countArr[3]>=Gmin && countArr[4]>=Tmin) {
                count++;
            }
            left++;
            right++;


        }

        System.out.println(count);

    }
}
