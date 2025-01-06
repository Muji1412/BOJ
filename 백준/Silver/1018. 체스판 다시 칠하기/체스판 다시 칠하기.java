import java.util.Scanner;

public class Main {
    // 체스판 패턴 정의
    static String[] whiteStart = {
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW"
    };

    static String[] blackStart = {
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB"
    };

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();

        String[] board = new String[N];

        for (int i = 0; i < N; i++) {
            board[i] = scanner.nextLine();
        }
        System.out.println(minRepaintsToChessborad(N, M, board));




    }

    static int countRepaints(String[] board, int startRow, int startCol, String[] pattern) {
        int count = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[startRow + i].charAt(startCol + j) != pattern[i].charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }
    static int minRepaintsToChessborad(int N, int M, String[] board) {
        int minRepaint = Integer.MAX_VALUE;

        for (int i = 0; i<=(N-8);i++) {
            for (int j = 0; j<=(M-8);j++) {
                int repaintsWhite = countRepaints(board, i, j, whiteStart);
                int repaintsBlack = countRepaints(board, i, j, blackStart);

                    minRepaint = Math.min(minRepaint, Math.min(repaintsWhite, repaintsBlack));
            }
        }
        return minRepaint;

    }

}
