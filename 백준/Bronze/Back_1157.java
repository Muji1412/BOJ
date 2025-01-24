import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Back_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next().toUpperCase();

        HashMap<Character, Integer> map = new HashMap<>();

        // 각 알파벳 카운트
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if(map.containsKey(c)) {
                int count = map.get(c);    // 현재 저장된 개수를 가져오고
                count++;                   // 1 증가시킨 다음
                map.put(c, count);         // 다시 저장
            } else {
                map.put(c, 1);            // 처음 나온 글자면 1로 저장
            }
        }
        // 가장 많이 사용된 알파벳 찾기
        int max = 0;
        char result = '?';

        // int max = 최대값 저장
        // char result = 제일 많이 나온 알파벳 저장


        // Map 안의 모든 키, 값을 체크
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {

            // Value값을 조회해서, 지금까지 조회했던 값들보다 큰 경우에는 result에 값을 갱신해줌
            if(entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
                // 예외로, 지금까지 나온 max값이랑 Value값이 일치하는 경우에는 알파벳을 ? 로 바꿈
            } else if(entry.getValue() == max) {
                result = '?';
            }
        }

        // 예시
        // Mississipi 입력
        // M = 1
        // I = 4
        // S = 4
        // P = 1

        // M = 1, max값이랑 비교했을때, 1이 더 크므로, max값 1로 갱신, result값 M으로 갱신
        // I = 4, max값이랑 비교했을때, 4가 더 크므로, max값 4로 갱신, result값 I으로 갱신
        // S = 4, max값이랑 비교했을때, 4와 같으므로, else if문 실행으로 result값만 '?' 로 갱신
        // P = 1, max값이랑 비교했을때, 1이 더 작으므로, if문 else if문 아무것도 충족하지 않아 아무일도 일어나지 않음


        //그대로 result 출력

        System.out.println(result);

    }

}