import java.util.Scanner;

public class TicTacToe {


    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe");


        String greeting = "Welcome";
        System.out.println(greeting);

        int userNumber = 5;
        System.out.println(userNumber);

        double userOneScore = 0.5;
        System.out.println(userOneScore);

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = input.nextLine();
        System.out.println(userName);

        System.out.println("Enter a marker (number)");
        int userMarker = input.nextInt();

        System.out.println("You choose " + userMarker + " to mark squares");


        int count = 3;
        int winningNum = 3;

        //compare count with winningNum

        System.out.println( count == winningNum);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Input x or o");
        String useranswer = input2.nextLine();
        System.out.println((useranswer.equals("x")) || (useranswer.equals("o")));
    }


}
