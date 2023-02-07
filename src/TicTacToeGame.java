import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        UC1();
        UC2();

    }
    public static void UC1(){
        String [] board = new String[10];
        for(int i = 1; i<board.length; i++){
            board[i] = String.valueOf(i);
        }
        System.out.println(Arrays.toString(board));
    }
    public static void UC2(){
        System.out.println("Please choose your letter for playing (X or O) \nType letter & press Enter ");
        Scanner sc = new Scanner(System.in);
        String playLetter = sc.next();
        if(playLetter.equals("x")){
            System.out.println("you chose X\nNow Computer will play with O");
        } else if (playLetter.equals("o")) {
            System.out.println("you chose O\nNow Computer will play with X");
        }else {
            System.out.println("Invalid Input");
            UC2();
        }
    }
}
