import java.util.Scanner;

public class TicTac {
    public static void main(String[] args) {
        String[] board = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
        printBoard(board);
        Scanner sc = new Scanner(System.in);
        String playermove = sc.nextLine();
        System.out.println("Enter your choice player X - (1-9): ");
        char turn = 'X';

        // char symbol2 = 'O';

        sc.close();

    }

    public static void printBoard(String[] board) {
        // printing board
        System.out.println("---------------------");
        System.out.println(board[0] + '|' + board[1] + '|' + board[2]);
        System.out.println("-+-+-");
        System.out.println(board[3] + '|' + board[4] + '|' + board[5]);
        System.out.println("-+-+-");
        System.out.println(board[6] + '|' + board[7] + '|' + board[8]);
        System.out.println("-----------------------");
    }

    public static void playerMove(String s) {

    }
}
