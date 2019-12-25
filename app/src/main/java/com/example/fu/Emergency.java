package com.example.fu;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class Emergency extends AppCompatActivity {
    RecyclerView recyclerView;
    Context context=this;
        ArrayList<DataEmergency> mData=new ArrayList<>();
        String num[]={"112","110","155","158","177","183"};
        int imgSrc[]={
                R.mipmap.emergency,
                R.mipmap.fire,
                R.mipmap.police,
                R.mipmap.coast,
                R.mipmap.forestfire,
                R.mipmap.missing};
        String num_desp[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);
        ActionBar actionBar = getSupportActionBar();
        String title_name=getString(R.string.title_activity_emergency);
        getSupportActionBar().setTitle(title_name);
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        recyclerView=findViewById(R.id.rec_emergency);
        LinearLayoutManager manager=new LinearLayoutManager(context);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        manager.scrollToPosition(0);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);//sil

        Adapter_for_emergency_number adapter=new Adapter_for_emergency_number(mData,context);



        recyclerView.setAdapter(adapter);

        num_desp=getResources().getStringArray(R.array.emergency_list);
        for (int i=0;i<num.length;i++){
            mData.add(new DataEmergency(num[i],num_desp[i],imgSrc[i],R.drawable.phone));
        }




    }
    public boolean onOptionsItemSelected(MenuItem item){
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
