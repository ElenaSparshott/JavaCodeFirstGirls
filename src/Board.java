public class Board {

    private char[][] board;
    private char  defaultValue = '*';

    public Board(){
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

    private char[][] createBoard(){

        board = new char[3][3];
        for(int row=0; row<3; row++){
            for(int col=0; col<3; col++){
                board[row][col] = defaultValue;
            }
        }
        return board;
    }




    public static void main(String[] args) {
        Board testBoard = new Board();
    }
}
