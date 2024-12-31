import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //5줄 주어짐, 최대 15개 문자 들어옴
        //대문자, 소문자, 숫자만 들어옴
        //세로로 읽어서 출력

        String[][] arr = new String[15][5];

        // 기본적으로 다 널값으로 채워넣기

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j<5; j++) {
                arr[i][j] = "null";
            }
        }

        // 입력값 받아서 넣어주기

        for (int i = 0; i < 5; i++) {
            String line = br.readLine();
            String[] lineSplit = line.split("");
            // 입력값들로 널에서 값으로 바꿔줌
            for (int j = 0; j< lineSplit.length; j++) {
                arr[j][i] = lineSplit[j];
            }
        }

        // if문에서 null값 아니면 출력해주기
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j<5; j++) {
                if (!arr[i][j].equals("null")) {
                    System.out.print(arr[i][j]);
                }
            }
        }
    }
}
