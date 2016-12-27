package text.bwie.asus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //瀑布流
    public  void WaterWall(View v){
        EnterIntent(WaterWallActivity.class);
    }
    //CardView
    public  void  cardView (View v){
        EnterIntent(CardView.class);
    //RecycleView刷新加载：
    } public  void  refrush (View v){
        EnterIntent(RefrushActivity.class);
    }
    //跳转
    public  void EnterIntent(Class c){
        Intent in=new Intent(this,c);
        startActivity(in);
    }
}
