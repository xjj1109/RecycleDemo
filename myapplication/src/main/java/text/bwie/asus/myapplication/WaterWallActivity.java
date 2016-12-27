package text.bwie.asus.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

import adapter.WaterWallAdapter;
import utils.Images;

public class WaterWallActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    ArrayList<String> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_wall);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL));
        for (int i = 0; i < Images.imageUrls.length; i++) {
            list.add(Images.imageUrls[i]);
        }
        recyclerView.setAdapter(new WaterWallAdapter(WaterWallActivity.this,list) );

    }

}
