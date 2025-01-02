import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//두 정수 A B를 한번에 입력받은 다음에 A+B 출력하는 프로그램 코드
		//입력
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int sum = A+B;
		
		System.out.println(sum);
	}
}
