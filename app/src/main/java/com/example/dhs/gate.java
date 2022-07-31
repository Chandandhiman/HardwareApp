package com.example.dhs;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;



public class gate extends AppCompatActivity {
    ImageView i;
    GridView g;
    Context context;
    Integer[] images = {R.drawable.g, R.drawable.w, R.drawable.s, R.drawable.t, R.drawable.d};
    String[] names = {"Gates Designs", "Window Grill", "Stairs Railing", "Terrace Railing", "Door Design"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gate);
        g = (GridView) findViewById(R.id.grid1);
        String data[] ={"Gates Designs", "Window Grill", "Stairs Railing", "Terrace Railing", "Door Design"};
        setTitle("Gate Designs");
        CustomAdapter customAdapter = new CustomAdapter(gate.this, names, images);
        g.setAdapter(customAdapter);
        g.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(gate.this,Grid_Item_Activity.class);
                String p = (String) g.getItemAtPosition(position);
                i.putExtra("Key",p);
                startActivity(i);
            }
        });
    }
    public class CustomAdapter extends ArrayAdapter {
        Context context;
        String[] names;
        Integer[] images;

        public CustomAdapter(@NonNull Context context, String[]names, Integer[] images) {
            super(context, R.layout.gatedesign, names);
            this.context=context;
            this.names=names;
            this.images=images;
        }

        @NonNull
        @Override
        public View getView(int position,  View view, @NonNull ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rowView = inflater.inflate(R.layout.gatedesign,null,true);
            TextView title = (TextView)rowView.findViewById(R.id.textView6);
            ImageView imageView = (ImageView)rowView.findViewById(R.id.imageView5);
            title.setText(names[position]);
            imageView.setImageResource(images[position]);
            return rowView;
        }

    }

}
