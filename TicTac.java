import java.util.Random;
import java.util.Scanner;

public class TicTac {

    public static void main(String[] args) {
        final String[] board = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
        printBoard(board);
        playerMove(board);

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

    public static void playerMove(String[] bd) {
        Scanner sc = new Scanner(System.in);
        // bolean x = True;
        String symbol1 = "X";
        while (true) {
            System.out.println("Enter your choice player X - (1-9): ");
            // Evaluating moves wether it is valid or not
            try {
                int pm = sc.nextInt();
                pm = pm - 1;
                if (pm >= 0 && pm <= 9) {
                    // for (String i : bd) {
                    // // System.out.println(i);
                    // if (i.equals("X") || i.equals("O")) {
                    // System.out.println("Space occupied\nTry another move");

                    // }
                    // }
                    // System.out.println("Value entered in board");

                    if (bd[pm].equals("O") || bd[pm].equals("X")) {
                        System.out.println("Space occpied");
                    } else {

                        bd[pm] = symbol1;
                        printBoard(bd);
                        computerMove(bd);
                    }

                } else {
                    System.out.println("Invalid move");
                }
            } catch (Exception e) {
                System.out.println("Only Integer input value \nTry again");
                break;

            }

        }
        // sc.close();
    }

    public static void computerMove(String[] bd) {
        Random rand = new Random();
        while (true) {

            int cm = rand.nextInt(9);
            // for (String i : bd) {
            // if (i.equals("X") || i.equals("O")) {
            // System.out.println("Space occupied");

            // }

            // }
            String symbol2 = "O";
            if (bd[cm].equals("O") || bd[cm].equals("X")) {
                System.out.println("Space Occupied");
            } else {

                bd[cm] = symbol2;
                printBoard(bd);
                playerMove(bd);
            }

        }
    }

}
