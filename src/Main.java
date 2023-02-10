import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String [] board = new String[10];
    static String playLetter = null;
    static int toss = 0;
    static int stop = 0;
    public static void main(String[] args) {
        UC1();
        UC2();
        toss = UC6();
        if(toss == 1) {
            System.out.println("You won the toss \nmake 1st move");
        }else{
            System.out.println("you Lost the toss Computer will make 1st move");
        }
        while(stop ==0) {
            UC4();
            UC7();
        }

    }
    public static void UC1(){

        for(int i = 1; i< board.length; i++){
            board[i] = String.valueOf(i);
        }
    }
    public static void UC2(){
        System.out.println("Please choose your letter for playing (X or O) \ntype letter & press enter");
        playLetter = sc.next();
        if(playLetter.equals("x") ){
            System.out.println("You choose X \nnow computer will play with O");
        } else if(playLetter.equals("o")){
            System.out.println("You choose O \nnow computer will play with X");
        }else{
            System.out.println("Invalid Input \n");
            UC2();
        }

    }
    public static void UC3ShowBoard(){
        System.out.println("| " +board[1] + " | " +board[2]+ " | " +board[3]+ " |\n-------------");
        System.out.println("| " +board[4] + " | " +board[5]+ " | " +board[6]+ " |\n-------------");
        System.out.println("| " +board[7] + " | " +board[8]+ " | " +board[9]+ " |\n-------------");
    }
    public static void UC4(){
        System.out.println("");
        UC3ShowBoard();
        System.out.println("Enter a slot number to Enter "+playLetter);
        int input = sc.nextInt();
        if(board[input].equals(String.valueOf(input))) {

            switch (input) {
                case 1, 2, 3, 4, 5, 6, 7, 8, 9:
                    board[input] = playLetter;
                    UC3ShowBoard();
                    break;
                default:
                    System.out.println("Invalid slot Number. please Enter valid slot Number");
                    UC4();
                    break;

            }
        } else{
            System.out.println("Slot already used");
            UC4();
        }


    }
    public static int UC6(){
        int toss = (int)((Math.random()*10) %2);
        return toss;
    }

    public static void UC7(){
        for (int i = 0; i < 8; i++) {
            String line = null;

            switch (i) {
                case 0:
                    line = board[1] + board[2] + board[3];
                    break;
                case 1:
                    line = board[4] + board[5] + board[6];
                    break;
                case 2:
                    line = board[7] + board[8] + board[9];
                    break;
                case 3:
                    line = board[1] + board[4] + board[7];
                    break;
                case 4:
                    line = board[2] + board[5] + board[8];
                    break;
                case 5:
                    line = board[3] + board[6] + board[9];
                    break;
                case 6:
                    line = board[1] + board[5] + board[9];
                    break;
                case 7:
                    line = board[3] + board[5] + board[7];
                    break;
            }
            if (line.equals("xxx")) {
                if(playLetter.equals("x")){
                    System.out.println("you won the game");
                    stop = 1;
                } else{
                    System.out.println("Computer won the game");
                    stop = 1;
                }

            }else if (line.equals("ooo")) {
                if(playLetter.equals("o")){
                    System.out.println("you won the game");
                    stop = 1;
                } else{
                    System.out.println("Computer won the game");
                    stop = 1;
                }

            }
        }

    }
}