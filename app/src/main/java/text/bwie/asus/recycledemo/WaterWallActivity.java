package text.bwie.asus.recycledemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

import adapter.WaterWallAdapter;
import utils.Images;

public class WaterWallActivity extends AppCompatActivity {
    ArrayList<String > list=new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_wall);
        recyclerView = (RecyclerView) findViewById(R.id.recycleView);
        //瀑布流效果
       recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL));
        for (int i = 0; i <Images.imageUrls.length ; i++) {
            list.add(Images.imageUrls[i]);
        }
        recyclerView.setAdapter(new WaterWallAdapter(this,list));

    }

}
