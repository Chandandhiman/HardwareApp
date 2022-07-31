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

import java.security.Key;

public class interior extends AppCompatActivity {


    GridView gv;
    Context context;
    Integer[] images = {R.drawable.doorhandle,R.drawable.doorhandle,R.drawable.doorhandle};
    String[] names = {"Door Handle","Door Handle","Door Handle"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interior);
        setTitle("Interrior Designs");
        CustomAdapter customAdapter = new CustomAdapter(interior.this, names, images);
        gv = (GridView) findViewById(R.id.gv);
        gv.setAdapter(customAdapter);
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i= new Intent(interior.this,Grid_Interior_Activity.class);
                String s = (String)gv.getItemAtPosition(position);
                i.putExtra("Key",s);
                startActivity(i);
            }
        });
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