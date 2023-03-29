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
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }


    public static char[][] createboard(){
        char [][] board = new char[3][3];
        return board;
    }


    public static void main(String[] args) {
        int number = 2;
        String username = getName(number);
        System.out.println("Hello " + username);

        int[] numbers = createArray();
        int[] array_again = createArray2();

        displayArray(numbers);
        displayArray(array_again);


        char [][] board = createboard();

    }
}
