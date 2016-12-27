package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import holder.RefushHolder;
import text.bwie.asus.myapplication.R;

/**
 * Created by asus on 2016/12/27.
 */

public class RefushAdapter extends RecyclerView.Adapter<RefushHolder> {
    private final Context context;
    private final List<String> list;
    public RefushAdapter(Context context, List<String> list) {
        this.context=context;
        this.list=list;
    }

    @Override
    public RefushHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = View.inflate(context, R.layout.layout_refrush_item, null);
        RefushHolder refush=new RefushHolder(v);
        return refush;
    }

    @Override
    public void onBindViewHolder(RefushHolder holder, int position) {
        holder.tv.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
