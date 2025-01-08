import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //문자열 S가 주어졌을 때, S의 서로 다른 부분 문자열의 개수를 구하는 프로그램을 작성하시오
        //부분 문자열은 S에서 연속된 일부분을 말하며, 길이가 1보다 크거나 같아야 한다.
        //ababc의 부분 문자열은 a, b, a, b, c, ab, ba, ab, bc, aba, bab, abc, abab, babc, ababc가 있고,
        //서로 다른것의 개수는 12개이다


        // 문자열 들어옴
        // 일단 다 쪼개서 보관 - 0개일때, 0+1개,2개,3개..
        // 해시셋에 같은값 보관하면 어차피 날아가버림,

        // 어레이 없이 그냥 단어로만 받기
        String S = br.readLine();
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < S.length(); i++) {
            //01234
            for (int j = i+1; j <= S.length(); j++) {
//                System.out.println("ij = " + i + "" + j );
                set.add(S.substring(i, j));
            }
        }

        System.out.println(set.size());

        // 필요한건 반복이 아니라
        // 반복 몇번만 딸깍 해서 안에 값 만들어주는거
        // 서브스트링 사용하면 쉽게 가능함
        // 섭 01 12 23 34 45 = a,b,c,d,e
        // 섭 02 13 24 35
        // 섭 03 14 25
        // 섭 04 15 
        // 섭 05

                //charAt 0부터 1까지, 1부터 2까지 2,3 3,4
                //0부터 2까지, 1부터 3까지, 2부터 4까지


    }
}
