package com.example.dhs;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class adapter extends BaseAdapter {

    Context c;
    int images[];
    String names[];

    adapter(Context c,int images[],String names[]){
        this.c=c;
        this.images=images;
        this.names=names;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView iv = new ImageView(c);
        TextView t= new TextView(c);
        iv.setLayoutParams(new ViewGroup.LayoutParams(200,200));
        iv.setImageResource(images[position]);
        t.setText(names[position]);
        return iv;
    }
}
