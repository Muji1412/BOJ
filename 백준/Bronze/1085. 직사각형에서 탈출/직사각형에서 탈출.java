import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 현수위치 = x,y
        int x = sc.nextInt();
        int y = sc.nextInt();

        // 꼭지점의 위치 = 0,0,w,h
        int w = sc.nextInt();
        int h = sc.nextInt();


        //00이랑 비교하고 wh랑 비교해서 더 작은값 내놓ㅇ므

        int WmiX = w - x;
        int HmiY = h - y;

        int min1 = Math.min(x, y);
        int min2 = Math.min(WmiX, HmiY);
        System.out.println(Math.min(min1,min2));
    }
}
