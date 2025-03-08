import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        number /= 100;
        number *= 100;
        int divisor = Integer.parseInt(br.readLine());
        int result = 0;
        while (number % divisor != 0) {
            number++;
            result++;
        }
        if (result < 10) {
            System.out.print("0" + result);
        } else {
            System.out.print(result);
        }
    }
}