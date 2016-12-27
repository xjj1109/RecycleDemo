package text.bwie.asus.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapter.RefushAdapter;
//
public class RefrushActivity extends AppCompatActivity {

    private SwipeRefreshLayout swipeRefreshLayout;
    private RecyclerView recycler;
    private  int  MAX_COUNT=20;
    private int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refrush);
        initView();
    }
    //找控件
    private void initView() {
        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout);
        //设置进度条颜色
        swipeRefreshLayout.setColorSchemeColors(Color.RED, Color.BLUE, Color.GREEN);
        recycler = (RecyclerView) findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        initData();
       recycler.setAdapter(new RefushAdapter(this,list));
    }
    ArrayList<String> list=new ArrayList<>();
    private void initData() {
        for (int i = 0; i <MAX_COUNT ; i++) {
            list.add("我是条目"+i);
        }
}
}
