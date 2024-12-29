import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        // 단어길이체크
        int length = input.length();
        int[] name = new int[length];



        // 단어 배열-아스키값 (a=0  z=25)
        for (int i = 0; i < length; i++) {
            name[i] = input.charAt(i) - 97;
//            System.out.print(name[i] + " ");
        }
//        System.out.println("아이값끝");


        // 알파벳 배열 만들기
        // -1 넣어서 초기화 
        int[] alphabet = new int[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = -1;
            // 0부터 25까지 탐색, 
            for (int j = 0; j < length; j++) {
                //i랑 name[j] 의 아스키값이랑 일치하면단어의 j번째 위치한것이므로 j로 초기화. 중복 피할려면 ==-1추가
                if (alphabet[i] == -1 && i == name[j]) {
                    alphabet[i] = j;
                }
            }
        }
        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
        }
    }
}


