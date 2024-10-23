package com.grocet.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.grocet.R;
import com.grocet.model.GridModel;

import java.util.List;

public class GridAdapter extends BaseAdapter {

    private Context context;
    private List<GridModel> items;

    public GridAdapter(Context context, List<GridModel> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.grid_item, parent, false);
        }

        GridModel currentItem = items.get(position);

        ImageView imageView = convertView.findViewById(R.id.grid_item_image);
        TextView textView = convertView.findViewById(R.id.grid_item_text);

        imageView.setImageResource(currentItem.getImageResId());
        textView.setText(currentItem.getTitle());

        return convertView;
    }
}
