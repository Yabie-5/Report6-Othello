package jp.ac.uryukyu.ie.e205744;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 盤上にコマをおいたりひっくり返すことができるクラス。
 * 現在はコマで挟んでもひっくり返すことができない。
 * komaList 盤面にあるコマ
 * xNum 盤面の幅
 * yNum 盤面の高さ
 * 
 */
public class Board{
    private List<Koma> komaList;
    private int xNum = 0;
    private int yNum = 0;

    public Board(int _xNum, int _yNUm){
        this.xNum = _xNum;
        this.yNum = _yNUm;
    }


    Scanner scanner = new Scanner(System.in);

    public int getInput_x(){
        System.out.println("上から何番目のマスにしますか？");
        int input_x = scanner.nextInt();
        return input_x;
    }

    public int getInput_y(){
        System.out.println("左から何番目のマスにしますか？");
        int input_y = scanner.nextInt();
        return input_y;
    }


    
    public void setBoard(){
        this.komaList = new ArrayList<>();
        for (int y=0 ; y<this.yNum; y++){
            for (int x=0 ; x<this.xNum ; x++){
                Koma koma = new Koma(x,y);
                this.komaList.add(koma);
            }
        }
    }

    public Koma getKoma(int x, int y){
        for(Koma koma : this.komaList){
            int[]pos = koma.getPosition();
            if(pos[0] == x && pos[1] == y){
                return koma;
            }
        }

        return null;
    }

    public void putKoma(int x, int y, String state){
        Koma koma = this.getKoma(x, y);
        koma.setState(state);
    }

    public void printBoard(){
        String [][] board = new String [xNum][yNum];
        for (Koma koma : this.komaList){
            int[] pos = koma.getPosition();
            String state = koma.getState();
            board[pos[0]][pos[1]] = state;
            
        }

        System.out.println("\n\t0\t1\t2\t3\t4\t5\n");
        for ( int y=0 ; y<board.length; y++){
            System.out.print(y + "\t");
            for ( int x=0 ; x<board[0].length; x++){
                String b = board[y][x];
                System.out.print(b + "\t");
            }
            System.out.println("\n");
        }
    }
}