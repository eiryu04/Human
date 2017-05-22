package jp.techacademy.yurie.maeda.human;

import android.graphics.EmbossMaskFilter;
import android.util.Log;

class Human extends Animal implements Thinkable{
    // クラス変数
    static String to_jp = "人";

    // コンストラクタ
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

     // メンバ関数
    public void say() {
        Log.d("javatest", "私の名前は" + this.name + "です" + "年は" + this.age + "歳です。");
    }

    String hobby;

    @Override
    public  void think(){
        this.hobby = "映画";
        Log.d("javatest","私は" + this.hobby + "について考える");
    }
}

