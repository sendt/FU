package com.example.fu;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import java.util.ArrayList;

public class AboutCampus extends AppCompatActivity {
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
    ArrayList<Data_Campus> data_campuse = new ArrayList<>();
    RecyclerView recyclerView;
    Context context = this;
    ViewFlipper v_flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_campus);
        //ViewPager viewPager=findViewById(R.id.change_campus);
        //ImageAdapter_for_Campus imageAdapter_for_campus=new ImageAdapter_for_Campus(this);
        //viewPager.setAdapter(imageAdapter_for_campus);
        v_flipper=findViewById(R.id.change_campus);
        for(int temp:mImageid){
            flipperImages(temp);
        }
        data_campuse.add(new Data_Campus(
                getResources().getString(R.string.campus_txt1),
                getResources().getString(R.string.campus_txt2),
                getResources().getString(R.string.campus_txt3),
                getResources().getString(R.string.campus_txt4),
                getResources().getString(R.string.campus_txt5)

        ));
        data_campuse.add(new Data_Campus(
                getResources().getString(R.string.campus_txt6),
                getResources().getString(R.string.campus_txt7),
                getResources().getString(R.string.campus_txt8),
                getResources().getString(R.string.campus_txt9),
                getResources().getString(R.string.campus_txt10)

        ));

        data_campuse.add(new Data_Campus(
                getResources().getString(R.string.campus_txt11),
                getResources().getString(R.string.campus_txt12),
                getResources().getString(R.string.campus_txt13)
        ));

        recyclerView = findViewById(R.id.recyclerview_campus);
        LinearLayoutManager manager = new LinearLayoutManager(context);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        //manager.scrollToPosition(0);
        recyclerView.setLayoutManager(manager);
        //recyclerView.setHasFixedSize(true);

        Adapter_Campus adapter = new Adapter_Campus(data_campuse, context);
        recyclerView.setAdapter(adapter);

        ActionBar actionBar = getSupportActionBar();
        String title_name = getString(R.string.fu_student_campus);
        getSupportActionBar().setTitle(title_name);
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

    }
    public  void flipperImages(int images){
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(images);
        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(2000);//4 second
        v_flipper.setAutoStart(true);

        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}
