import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[10];
        int count = 0;
        boolean isDup;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt() % 42;
        }

        for (int i = 0; i < nums.length; i++) {
            isDup = false;

            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    isDup = true;
                    break;
                }
            }
            if (!isDup) {
                count++;
            }
        }
        System.out.println(count);
    }
}
