import java.util.Scanner;

public class Board {

    private char[][] board;
    private char  defaultValue = '*';

    public Board(){
        System.out.println("initialising");
        createBoard();
    }

    public void displayBoard(){



        for(int row=0; row<3; row++) {
            String row_str = "";
            for (int col = 0; col < 3; col++) {
                row_str+= " | " + board[row][col];
            }
            System.out.println(row_str);
        }
    }

    public char[][] createBoard(){

        board = new char[3][3];
        for(int row=0; row<3; row++){
            for(int col=0; col<3; col++){
                board[row][col] = defaultValue;
            }
        }
        return board;
    }


    public void gameLoop(){

        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to display the board (yes or No)");
        String userAnswer = input.nextLine();

        while(userAnswer.equals("yes")) {
            displayBoard();
            System.out.println("Do you want to display the board (yes or No)");
            userAnswer = input.nextLine();
        }

    }


    public static void main(String[] args) {
        Board testBoard = new Board();
        testBoard.displayBoard();
        testBoard.gameLoop();
    }
}
