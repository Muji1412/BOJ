import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in));

        String input = reader.readLine();

//        Integer[] arr = Arrays.stream(input.split("")) // 스트림으로 바꿔주면서 스플릿 넣어서 나눠줌
//                .map(Integer::parseInt) // 정수로 매핑해주기
//                .toArray(Integer[]::new);
        // 너무 복잡함

        int[] arr = new int[input.length()];

        for (int i = 0; i < input.length(); i++) {
//            System.out.println(input[i]);
            arr[i] = input.charAt(i)-'0' ;
        }

//        System.out.println("정렬 전 배열: " + Arrays.toString(arr));

//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i] < arr[j]) { // 뒤에거가 크면 앞으로 가져오는거니까 내림차순 <-> 오름차순 바뀌는 이유
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
        // 나랑 다르게 시간복잡도 낮게 어레이소트로 정렬하고 수 좌우반전(내림차순으로 변경)

        Arrays.sort(arr);
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i]; // i랑 끝값, i+1이랑 끝-1값, i+2랑 끝-2값 변경
            arr[arr.length-1-i] = temp;
        }
//        System.out.println("정렬 후 배열: " + Arrays.toString(arr));

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }

        System.out.println(sb);
    }
}
