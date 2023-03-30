import java.util.Scanner;

public class Board {

    public char[][] createBoard(){
        char [][] board = new char[3][3];
        for(int row=0; row<3; row++){
            for(int col=0; col<3; col++){
                board[row][col] = ' ';
            }
        }
        return board;
    }

    public void displayBoard(char[][] board){
        for(int row=0; row<3; row++) {
            String row_str = "";
            for (int col = 0; col < 3; col++) {
                System.out.println(row_str+= " | " + board[row][col]);
            }
        }
    }

    public void gameLoop(){

        char [][] newBoard = createBoard();

        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to display the board (yes or No)");
        String userAnswer = input.nextLine();

        while(userAnswer.equals("yes")) {
            displayBoard(newBoard);
            System.out.println("Do you want to display the board (yes or No)");
            userAnswer = input.nextLine();
        }

    }


    public static void main(String[] args) {
        Board testBoard = new Board();
        testBoard.gameLoop();
    }
}
