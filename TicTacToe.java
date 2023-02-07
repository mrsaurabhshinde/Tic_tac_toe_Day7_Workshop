package com.bl.Day7Workshop;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
       TicTacToe t =new TicTacToe();
       t.Uc1();
       t.Uc2();

    }


public static void Uc1(){
    String [] board = new String[10];
    for(int i=1; i<board.length;i++){
        board[i] = String.valueOf(i);
    }
    System.out.println(Arrays.toString(board));
}
    public static void Uc2(){
        System.out.println("choose your letter for playing");
        Scanner sc = new Scanner(System.in);
        String playLetter=sc.next();
        if(playLetter.equals("x")){
            System.out.println("you choose x\nComputer will choose 0");
        }else if(playLetter.equals("0")){
            System.out.println("you choose 0\ncomputer will choose x");
        }else {
            System.out.println("invalid input");
            Uc2();
        }
    }
}




