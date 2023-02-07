package com.bl.Day7Workshop;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
       TicTacToe t =new TicTacToe();
       t.uc1();

    }


public static void uc1(){
    String [] board = new String[10];
    for(int i=1; i<board.length;i++){
        board[i] = String.valueOf(i);
    }
    System.out.println(Arrays.toString(board));
}



}


