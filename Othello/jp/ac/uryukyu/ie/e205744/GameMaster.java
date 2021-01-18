package jp.ac.uryukyu.ie.e205744;

/**
 * ゲームを進行するクラス
 * プレイヤーは黒のコマを扱う。
 * 現在はNPCを実装していないため、黒しか出力されない。
 * 
 */
public class GameMaster {
    public static void main(String[] args){

        Board board = new Board(6, 6);
        board.setBoard();
        System.out.println("ゲームが始まります。");
        while(true){
            board.putKoma(board.getInput_x(), board.getInput_y(), "B");
            board.printBoard();
        }
    }
}