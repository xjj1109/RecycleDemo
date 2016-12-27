package holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import text.bwie.asus.myapplication.R;

/**
 * Created by asus on 2016/12/27.
 */
public class RefushHolder extends RecyclerView.ViewHolder {

    public final TextView tv;

    public RefushHolder(View itemView) {
        super(itemView);
        tv = (TextView) itemView.findViewById(R.id.tv);
    }
}
