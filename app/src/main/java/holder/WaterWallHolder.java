package holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import text.bwie.asus.recycledemo.R;

/**
 * Created by asus on 2016/12/27.
 */

public class WaterWallHolder extends RecyclerView.ViewHolder {

    public final ImageView img;

    public WaterWallHolder(View itemView) {
        super(itemView);
        img = (ImageView) itemView.findViewById(R.id.img);
    }
}
