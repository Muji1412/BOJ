import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int N = scanner.nextInt();

        int[] arr = new int[N - M + 1];
        // 배열에 수 입력
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + M;
//            System.out.println(arr[i]);
        }

        int[] arr0 = new int[N - M + 1];



        for (int i = 0; i < arr.length; i++) {
            // 1이랑 2용 예외처리 -> 1은 소수가 아님

            if (arr[i] == 1) {
                arr0[i] = 0;
            }
            if (arr[i] == 2) {
                arr0[i] = 2;
            }

            // 3부터는 2부터 n-1까지 나눠봤을때, %n == 0 일 경우에는 소수가 아님

            if (arr[i] >= 3) {
                //arr i 가 10일때,
                for (int j = 2; j < arr[i]; j++) {

                    int diviCounter = 0;

                    // 소수인 경우
                    //2,3,4,5,6,7,8,9를 j에 대입할건데, 0이 나오면 소수가 아니구나
                    if (arr[i] % j == 0) {
                        diviCounter++;
                    }

                    // 카운터가 증가했다는건 약수가 있다는말 -> arr값 0으로 바꾸고 종료
                    if (diviCounter>0) {
                        arr0[i] =0;
                        break;
                    }
                    // j값 돌리다가 끝까지 갔을때(j가 arr[i] - 1), 카운터 0이면 값 넣어주기
                    if (j == (arr[i] - 1) && diviCounter == 0) {
                        arr0[i] = arr[i];
                    }

                }
            }
        }



//        System.out.println("arr0");
        int sum = 0;
        int flag = 0;
        //Math.min으로 비교할건데 생각해보니까 이거 첫값이 0이면 적용이 안되니까..
        // 아니 그냥 for문 돌려서 0 아닌 첫번째값이 최소 소수아님?
        int min = 0;

        for (int i = 0; i < arr0.length; i++) {
            sum += arr0[i];

//            if (arr0[i] != 0) {
//                System.out.println(arr0[i]);
//            }
            if (flag == 0 && arr0[i] != 0) {
                min = arr[i];
                flag = 1;
            }
        }

//        System.out.println("답 출력구문");
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
