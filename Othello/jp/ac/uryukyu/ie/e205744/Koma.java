package jp.ac.uryukyu.ie.e205744;

/**
* コマの状態を管理するクラス
* state コマの状態
* x コマの位置のx座標
* y コマの位置のy座標
 */


public class Koma{
    private String state;
    private int x;
    private int y;

    //コンストラクタ
    public Koma(int _x , int _y ){
        this.state = "E";
        this.x = _x;
        this.y = _y;
    }

    /**
    * コマの状態を取得するメソッド。
    * state コマの状態
    */
    public String getState(){
        return this.state;
    }

    /**
    * コマの状態を変更するメソッド。
    * upState 入力したコマの状態
    */
    public void setState(String upState){
        this.state = upState;
    }

    /**
    * コマの状態を位置を取得するメソッド。
    * pos コマの位置
    */
    public int[] getPosition(){
        int[] pos = {this.x, this.y};
        return pos;
    }

}