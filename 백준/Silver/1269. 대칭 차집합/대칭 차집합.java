import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 해시셋 둘

        Scanner sc = new Scanner(System.in);


        // 기록용 해시셋 두개 생성

        int aNum = sc.nextInt();
        int bNum = sc.nextInt();

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        for (int i = 0; i < aNum; i++) {
            setA.add(sc.nextInt());
        }
        for (int i = 0; i < bNum; i++) {
            setB.add(sc.nextInt());
        }

        // 그냥 각 집합 개수 - 해시값끼리 일치한 카운트추가값

        int countA = 0;
        int countB = 0;
        for (int value : setA) {
            if (setB.contains(value)) {
                countA++;
            }
        }
        for (int value : setB) {
            if (setA.contains(value)) {
                countB++;
            }
        }

        //개수 카운팅

        int AdiffCount = setA.size() - countA;
        int BDiffCount = setB.size() - countB;
        int result = AdiffCount + BDiffCount;

        System.out.println(result);




    }
}
