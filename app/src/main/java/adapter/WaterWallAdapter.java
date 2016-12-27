package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import holder.WaterWallHolder;
import text.bwie.asus.recycledemo.R;

/**
 * Created by asus on 2016/12/27.
 */

public class WaterWallAdapter extends RecyclerView.Adapter<WaterWallHolder> {
    private final Context context;
    private final List<String> list;
    ArrayList<Integer> hightlist=new ArrayList<>();
    public WaterWallAdapter(Context context , List<String > list) {
        this.context=context;
        this.list=list;
        Random random=new Random();
        for (int i = 0; i <list.size() ; i++) {
            int i1 =100+ random.nextInt(300);

        }
    }
    @Override
    public WaterWallHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      View v=  View.inflate(context, R.layout.waterwall_item,null);
        WaterWallHolder waterWallHolder =new WaterWallHolder(v);
        return waterWallHolder;
    }
    @Override
    public void onBindViewHolder(WaterWallHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
