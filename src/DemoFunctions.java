import java.util.Scanner;


public class DemoFunctions {

    public static String getName(int userNumber){
        Scanner inputGetter = new Scanner(System.in);
        String askForName = "What is your name (user " +userNumber+")?";
        String greeting = "Hello ";
        String userName;

        System.out.println(askForName);
        userName = inputGetter.nextLine();
        System.out.println(greeting + userName);

        return userName;
    }



    public static int[] createArray() {
        int[] tempArray = {1,2,3};
        return tempArray;
    }

    public static int[] createArray2() {
        int[] tempArray = new int[3];
        tempArray[0] = 4;
        tempArray[1] = 5;
        tempArray[2] = 6;
        return tempArray;
    }


    public static void displayArray(int[] numbers) {
        int len = numbers.length;
        System.out.println("Length of array");
        System.out.println(len);
        System.out.println("Elements of the array");
        for(int ele_num= 0; ele_num<len; ele_num++){
            System.out.println(ele_num);
        }

    }


    public static char[][] createBoard(){
        char [][] board = new char[3][3];
        for(int row=0; row<3; row++){
            for(int col=0; col<3; col++){
                board[row][col] = ' ';
            }
        }
        return board;
    }

    public static void displayBoard(char[][] board){
        for(int row=0; row<3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.println("row:" + row + ", col:" + col + " | " + board[row][col]);
            }
        }
    }


    public static void main(String[] args) {
        int number = 2;
        String username = getName(number);
        System.out.println("Hello " + username);

        int[] numbers = createArray();
        int[] array_again = createArray2();

        displayArray(numbers);
        displayArray(array_again);


        char [][] newBoard = createBoard();
        displayBoard(newBoard);

    }
}

