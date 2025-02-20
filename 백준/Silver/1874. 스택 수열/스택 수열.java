import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        // 10만개까지 받으니까 버퍼드리더
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();


        // 원본 배열 순서 보관용 배열 생성 및 값 넣어주기
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int idx = 0;                            // 포인터(커서) 위치
        StringBuilder sb = new StringBuilder(); // 출력값 보관용 스트링빌더
        int pushNum = 1;                        // 1부터 n까지 스택에 넣어줄때 쓸 함수
        int[] auxArr = new int[n];              // 불가능 경우 체크하기위한 배열


        while (true) {
            while (!stack.isEmpty()) {              // 스택에서 모든 숫자가 빠질때까지 작동함
                if (stack.peek() == arr[idx]) {     // 만약, 스택 맨 위의 숫자가 현재 수열의 수와 같다면
                    auxArr[idx] = stack.pop();      // pop해서 스택에서 값을 제거, 임시배열 auxArr에 저장
                    sb.append("-").append("\n");    // 스트링빌더에 - 입력
                    idx++;                          // arr 배열의 다음 숫자로 넘어가기 위해서 포인터를 오른쪽으로 옮겨줌
                    
                } else {  // 만약 스택 맨 위의 숫자가 원하는 수가 아니면 while문 탈출
                    break;
                }
            }


            if (pushNum == n+1) { // 숫자 n까지만 저장하고 n+1의 경우에는 멈춤
                break;
            }
            stack.push(pushNum);  // 숫자 넣어줄때는, 숫자를 하나 넣고, 스트링빌더에 + 입력
            pushNum++;
            sb.append("+").append("\n");


        }
        
        
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (auxArr[i] != arr[i]) {  //제대로 완성됐는지 검사, 하나라도 일치하지 않았으면 원하는 배열이 나오지 않은것
                flag = 1;
            }
        }
        if (flag == 0) {                //플래그의 숫자에 따라 스트링빌더 or NO를 출력함 
            System.out.println(sb);
        } else {
            System.out.println("NO");
        }
    }
}
