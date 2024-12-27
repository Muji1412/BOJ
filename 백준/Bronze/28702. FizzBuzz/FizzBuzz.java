import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        // 맨아래 메소드로 받은 값 확인해서 정수라면 3/2/1 더해줌
        int answer = 0;
        for (int i = 3; i > 0; i--) {
            String a = br.readLine();
            if (checkIt(a).equals("num")) {
                answer = Integer.parseInt(a);
                answer = answer + i;
            }
        }

        //답 나왔는데 12 이꼴로 나와버릴때 피즈버즈로 바꿔주기
        if (FizzBuzzCheck(answer).equals("num")) {
            System.out.println(answer);
        } else {
            System.out.println(FizzBuzzCheck(answer));
        }



    }
    // 답이 나왔는데, 피즈버즈로 나와야할때,
    public static String FizzBuzzCheck(int a) {
        if (a % 3 == 0 && a % 5 != 0) {
            return "Fizz";
        } else if (a % 3 != 0 && a % 5 == 0) {
            return "Buzz";
        } else if (a % 3 == 0 && a % 5 == 0) {
            return "FizzBuzz";
        }
        return "num";
    }

    //맨처음 받을때 값 체크 - 근데 이거 고칠수 있지않냐?
    public static String checkIt(String a) {
        if (a.equals("Fizz") || a.equals("Buzz") || a.equals("FizzBuzz")) {
            return a;
        } else
            return "num";
    }
}
