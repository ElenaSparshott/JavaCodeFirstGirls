import java.util.Scanner;


public class DemoFunctions {

    public static String getName(){
        Scanner inputGetter = new Scanner(System.in);
        String askForName = "What is your name?";
        String greeting = "Hello ";
        String userName;

        System.out.println(askForName);
        userName = inputGetter.nextLine();
        System.out.println(greeting + userName);

        return userName;
    }

//    public static char[][] createBoard(){
//
//    }

    public static void main(String[] args) {
        getName();
    }
}
