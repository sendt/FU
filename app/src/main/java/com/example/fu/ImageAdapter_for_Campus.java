package com.example.fu;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapter_for_Campus extends PagerAdapter {
    Context mContex;
    private int[] mImageid = new int[]{
            R.drawable.imgs_1,
            R.drawable.imgs_2,
            R.drawable.imgs_3,
            R.drawable.imgs_4,
            R.drawable.imgs_5,
            R.drawable.imgs_6,
            R.drawable.imgs_7,
            R.drawable.imgs_8,
            R.drawable.imgs_9,
            R.drawable.imgs10,
            R.drawable.imgs11
    };

    public ImageAdapter_for_Campus(Context mContex) {
        this.mContex = mContex;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContex);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mImageid[position]);
        container.addView(imageView, 0);
        return imageView;
    }

    @Override
    public int getCount() {

        return mImageid.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {

        return view == object;
    }
}
