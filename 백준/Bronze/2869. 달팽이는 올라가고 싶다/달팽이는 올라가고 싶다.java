import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int v = scanner.nextInt();
        
        int dayCounter = 0;
        int meterNow = 0;
        int dest = v - b;
        int diff = a - b;
        int how = (dest / diff);

        if (dest%diff>0) {
            how++;
        }
        System.out.println(how);

//        while (true) {
//            meterNow = meterNow + a;
//            dayCounter++;
//            if (meterNow >= v) {
//                System.out.println(dayCounter);
//                break;
//            }
//            meterNow = meterNow - b;
//        }
    }
}
