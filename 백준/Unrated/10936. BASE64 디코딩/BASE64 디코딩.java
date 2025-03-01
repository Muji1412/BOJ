import java.util.Base64;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Base64.Decoder decoder = Base64.getDecoder(); // base64, 디코더 선언

        String decoded = new String(decoder.decode(input)); //변환

        System.out.println(decoded);
    }
}
