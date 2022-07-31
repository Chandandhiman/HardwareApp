package com.example.dhs;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class Grid_Interior_Activity extends AppCompatActivity {

    GridView g;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid__interior_);
        g=(GridView)findViewById(R.id.grid3);

        Intent i = getIntent();
        s = i.getStringExtra("Key");
        int DoorHandle []={R.drawable.g, R.drawable.w, R.drawable.s, R.drawable.t, R.drawable.d};
        String Gate2[]={"gate","window","door","railing","shutter"};
        int DoorHandle1 []={R.drawable.g, R.drawable.w, R.drawable.s, R.drawable.t, R.drawable.d};
        String Gate4[]={"gate","window","door","railing","shutter"};

        if (s.equalsIgnoreCase("Gates Designs")){
            adapter ad = new adapter(Grid_Interior_Activity.this,DoorHandle,Gate2);
            g.setAdapter(ad);
        }
        else if (s.equalsIgnoreCase("Window Grill")) {
            adapter ad = new adapter(Grid_Interior_Activity.this, DoorHandle1, Gate4);
            g.setAdapter(ad);

        }
        }
        static class CustomAdapter extends ArrayAdapter {
            Context context;
            String[] names;
            Integer[] images;

            public CustomAdapter(@NonNull Context context, String[] names, Integer[] images) {
                super(context, R.layout.interiordesign, names);
                this.context = context;
                this.names = names;
                this.images = images;
            }


            @NonNull
            @Override
            public View getView(int position, View view, @NonNull ViewGroup parent) {
                LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View rowView = inflater.inflate(R.layout.interiordesign, null, true);
                TextView title = (TextView) rowView.findViewById(R.id.textView7);
                ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView6);
                title.setText(names[position]);
                imageView.setImageResource(images[position]);
                return rowView;
            }

        }
}
