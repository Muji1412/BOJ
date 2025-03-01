import java.util.Base64;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Base64.Encoder encoder = Base64.getEncoder(); // base64, 인코더

        String encoded = encoder.encodeToString(input.getBytes()); // 변환

        System.out.println(encoded);
    }
}
