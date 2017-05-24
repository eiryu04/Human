package jp.techacademy.yurie.maeda.human;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("エミリー", 23,"映画"); //Humanのインスタンスを作る
        human.say();  // ログ出力
        human.think();
    }
}