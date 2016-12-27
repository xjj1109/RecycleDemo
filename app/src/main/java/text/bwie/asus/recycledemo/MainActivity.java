package text.bwie.asus.recycledemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //瀑布流
    public  void waterWall(View v){
    EnterIntent(WaterWallActivity.class);
    }
    //CardView
    public  void cardView(View v){

    }
    //刷新
    public  void reFrush(View v){

    }
    public  void EnterIntent(Class c){
        Intent intent =new Intent(this,c);
            startActivity(intent);
    }

}
