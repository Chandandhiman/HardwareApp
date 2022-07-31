package com.example.dhs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Adapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;


 public class product extends AppCompatActivity {

        int quantity;

        private Adapter CustomAdapter;
    GridView g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        g=(GridView)findViewById(R.id.grid);
        setTitle("Product");
        ProductAdapter ad = new ProductAdapter(this);
        g.setAdapter(ad);


        }
    public void decrement(View view) {
        quantity=quantity-1;

        if (quantity<0) {
            Toast.makeText(getApplicationContext(), "Less 1 Not Valid", Toast.LENGTH_SHORT).show();
        }

        else {
            displayquantity(quantity);
        }
    }

    private void displayquantity(int quantity) {
        TextView quantity1 = (TextView) findViewById(R.id.add);
        quantity1.setText(""+quantity);

    }

    public void increment(View view) {
        quantity = quantity + 1;
        if (quantity>100){
            Toast.makeText(getApplicationContext(),"More Then 100 is not Valid",Toast.LENGTH_SHORT).show();
        }
        else {
            displayquantity(quantity);
        }
    }



    }



