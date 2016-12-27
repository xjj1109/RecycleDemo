package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import holder.WaterWallHolder;
import text.bwie.asus.myapplication.R;

/**
 * Created by asus on 2016/12/27.
 */

public class WaterWallAdapter extends RecyclerView.Adapter <WaterWallHolder>{
    private final Context context;
    private final List<String> list;
     ArrayList<Integer> hightlist=new ArrayList<>();
    ArrayList<Integer> wighthlist=new ArrayList<>();
    private int hight;

    public WaterWallAdapter(Context context, List<String> list) {
        this.context=context;
        this.list=list;
        Random random=new Random();
        for (int i = 0; i <list.size() ; i++) {
            hight = 100+random.nextInt(300)  ;
            hightlist.add(hight);
        }
        for (int i = 0; i <list.size() ; i++) {
            int wigth = 100+random.nextInt(300);
            wighthlist.add(wigth);
        }
    }
    @Override
    public WaterWallHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = View.inflate(context, R.layout.layout_waterwall_item, null);
        WaterWallHolder waterWallHolder = new WaterWallHolder(v);
        return waterWallHolder;
    }

    @Override
    public void onBindViewHolder(WaterWallHolder holder, int position) {
        ViewGroup.LayoutParams layoutParams = holder.img.getLayoutParams();
        layoutParams.height=hightlist.get(position);
        holder.img.setLayoutParams(layoutParams);
        layoutParams.width=wighthlist.get(position);
        holder.img.setLayoutParams(layoutParams);
        //加载网络图片
        Glide.with(context).load(list.get(position)).placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).into(holder.img);
        //设置铺满/**/
        holder.img.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
}
