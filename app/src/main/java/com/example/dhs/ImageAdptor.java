package com.example.dhs;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageAdptor extends PagerAdapter {
    Context mContext;

    ImageAdptor(Context context){
    this.mContext = context;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == ((ImageView)object);
    }

    private int []sliderImageId = new int[]{
    R.drawable.hardwaretools, R.drawable.paint,R.drawable.waterpipe, R.drawable.doorhandel
    };

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
    ImageView imageView = new ImageView(mContext);
    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    imageView.setImageResource(sliderImageId[position]);
        ((ViewPager)container).addView(imageView,0);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ((ViewPager)container).removeView((ImageView)object);
    }

    @Override
    public int getCount() {
        return sliderImageId.length;
    }
}
