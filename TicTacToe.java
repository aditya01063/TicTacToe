import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to play tic tac toe game with me: ");
        String condition = sc.next();
        if (condition.equals("y")) {
            boolean a = true;
            TicTacToe game = new TicTacToe();
            game.base(a);
        } else if(condition.equals("n")){
            System.out.println("Quiting the game");

        }
        else{
            System.out.println("Wrong Input");
            System.out.println("Try again");
        }
        sc.close();

    }

    public void base(boolean n) {
        Scanner sc = new Scanner(System.in);

        while (n == true) {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if (j == 1 || j == 4) {
                        System.out.print("|");
                    } else if (i == 1 || i == 3) {
                        System.out.print("_");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println("Wana play again (1/0)");
            int d = sc.nextInt();
            if (d == 1) {
                // n = false;
                continue;
            } else if (d == 0) {
                break;
            } else {
                System.out.println("Wrong input");
                break;
            }

        }
        sc.close();
    }
}