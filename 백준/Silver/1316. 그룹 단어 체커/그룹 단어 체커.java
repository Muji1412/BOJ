import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        //개행문자 소비
        scanner.nextLine();
        int counter = 0;

        for (int i = 0; i < n; i++) {
            String a = scanner.nextLine();
            if (isThisGroup(a)==0) {
//                System.out.println("a = " + a);
                counter++;
            }
        }

        System.out.println(counter);
    }

    public static int isThisGroup(String a) {

        // 문자 받아서 워드값 넣음, 저장용으로 어레이 하나 만들어서 null넣음
        String[] words = a.split("");
        String[] arch = new String[words.length];
        for (int i = 0; i < arch.length; i++) {
            arch[i] = "null";
        }

        // 문자 순회하면서 같은거면 저장 안함.
        // 같ㅇ
        for (int i = 0; i < words.length-1; i++) {
            String temp;

            if (!words[i].equals(words[i+1])) {
                arch[i] = words[i];
            }
        }
        arch[arch.length-1] = words[words.length-1];

//        for (int i = 0; i < arch.length; i++) {
//            System.out.println("arch[i] = " + arch[i]);
//        }
        int ineedcounter = 0;

        for (int i = 0; i < arch.length-1; i++) {
            // i가 0일때, j 1부터 시작
            for (int j = i+1; j < arch.length; j++) {
                // 맨처음 넣어둔 널값 아닐때 비교
                if (!arch[i].equals("null")) {
                    if (arch[i].equals(arch[j])) {
                        ineedcounter++;
                    }
                }
            }
        }
        return ineedcounter;
    }
}
