import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int sumNow;
    static int minusPlus = 0;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();


        String[] arr = input.split("");
//        System.out.println(Arrays.toString(arr));



        // [5, 5, -, 5, 0, +, 4, 0]

        // 마이너스 나오기 전 까지의 값들은 전부 더하기
        // 마이너스 나온 이후의 값들은 전부 빼주면 됨


        for (int i = 0; i < arr.length; i++) {
            // 마이너스가 아직 안나온 경우
            if (minusPlus == 0) {
                if (arr[i].equals("+")) {
                    int a = Integer.parseInt(sb.toString());
                    sumNow += a;
                    sb.setLength(0);

                } else if (arr[i].equals("-")) {
                    int a = Integer.parseInt(sb.toString());
                    sumNow += a;
                    sb.setLength(0);
                    minusPlus = 1;
                } else {
                    sb.append(arr[i]);
                }
            }else if (minusPlus == 1) {
                if (arr[i].equals("+")) {
                    int a = Integer.parseInt(sb.toString());
                    sumNow -= a;
                    sb.setLength(0);
                } else if (arr[i].equals("-")) {
                    int a = Integer.parseInt(sb.toString());
                    sumNow -= a;
                    sb.setLength(0);
                } else {
                    sb.append(arr[i]);
                }
            }





        }
        // 마이너스 나온경우 = 1, 안나온경우 = 0
        if (minusPlus == 1) {
            int a = Integer.parseInt(sb.toString());
            sumNow -= a;
        } else {
            int a = Integer.parseInt(sb.toString());
            sumNow += a;
        }

        System.out.println(sumNow);
    }

}
