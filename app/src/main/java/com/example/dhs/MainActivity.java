package com.example.dhs;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ImageView i, i2,i3,i4;
    SearchView s;
    List< ProductList > mProductList;
    ProductList mProductListData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        i4 = (ImageView) findViewById(R.id.imageView3);
        i3 = (ImageView) findViewById(R.id.imageView4);
        i2 = (ImageView) findViewById(R.id.imageView2);



        //ViewPager Code Start From Here

        final ViewPager mViewPager = (ViewPager) findViewById(R.id.viewpager);
        ImageAdptor adpterView = new ImageAdptor(this);
        mViewPager.setAdapter(adpterView);

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                mViewPager.post(new Runnable() {
                    @Override
                    public void run() {
                        mViewPager.setCurrentItem((mViewPager.getCurrentItem() + 1));
                    }
                });

            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask, 3000, 3000);

        //ViewPager Code Ended




//Recyclerview Product List code start from here
        RecyclerView rv = (RecyclerView) findViewById(R.id.rview);
        GridLayoutManager mgridLayoutManager = new GridLayoutManager(MainActivity.this, 2);
        rv.setLayoutManager(mgridLayoutManager);

        mProductList = new ArrayList<>();
        mProductListData = new ProductList("Wall Paint", "", R.drawable.logo);
        mProductList.add(mProductListData);

        mProductListData = new ProductList("Cement Primer", "", R.drawable.logo);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Synthetic Paint", "", R.drawable.logo);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Wood Primer", "", R.drawable.logo);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Iron Primer", "", R.drawable.logo);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Paint Brush", "", R.drawable.logo);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Tarpeen", "", R.drawable.logo);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Glosy Paint", "", R.drawable.logo);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Thinner", "", R.drawable.logo);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Varnish", "", R.drawable.logo);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Wall Putty", "", R.drawable.logo);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Samosan", "", R.drawable.logo);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Board", "", R.drawable.logo);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Ply", "", R.drawable.logo);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Sunmica", "", R.drawable.logo);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Nails", "", R.drawable.logo);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Fevicole", "", R.drawable.logo);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Screew", "", R.drawable.logo);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Door Handle", "", R.drawable.logo);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Tower Bolt", "", R.drawable.logo);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Aldrop", "", R.drawable.logo);
        mProductList.add(mProductListData);

        ProductListAdapter productListAdopter = new ProductListAdapter(MainActivity.this, mProductList);
        rv.setAdapter(productListAdopter);
//Recyclerview Product List Code Ended





        LinearLayoutManager lm = new LinearLayoutManager(this);//to show card view, recycler View
        lm.setOrientation(LinearLayoutManager.VERTICAL);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, product.class);
                startActivity(i);
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this,gate.class);
                startActivity(i);
            }
        });

        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,interior.class);
                startActivity(i);
            }
        });
        rv.setLayoutManager(lm);
        rv.setOnTouchListener(new View.OnTouchListener()
            {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                Intent i = new Intent(MainActivity.this,gridShow.class);



                return false;
            }
        });




        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {

        } else if (id == R.id.nav_yourwishlist) {

        } else if (id == R.id.nav_location) {

        } else if (id == R.id.nav_inquryus) {

        } else if (id == R.id.nav_aboutus) {

        } else if (id == R.id.nav_rateus) {

        }
        else if (id == R.id.nav_shareapp) {

        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

