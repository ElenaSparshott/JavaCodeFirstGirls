import java.util.Scanner;

public class TicTacToe {

    Board tBoard;

    public TicTacToe(){
        System.out.println("Welcome to TicTacToe");
        tBoard = new Board();
    }

    public void gameLoop(){

        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to display the board (yes or No)");
        String userAnswer = input.nextLine();

        while(userAnswer.equals("yes")) {
            tBoard.displayBoard();
            System.out.println("Do you want to display the board (yes or No)");
            userAnswer = input.nextLine();
        }

    }

    public static void main(String[] args) {
        TicTacToe tt = new TicTacToe();
        tt.gameLoop();
    }


}
