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

public class Emergency_word extends AppCompatActivity {


    RecyclerView recyclerView;
    Context context=this;
    String eng[],tr[];
    ArrayList<DataEmergencyWord> mData=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_word);
        ActionBar actionBar = getSupportActionBar();
        String title_name=getString(R.string.title_activity_emergency_word);
        getSupportActionBar().setTitle(title_name);
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        recyclerView=findViewById(R.id.rec_emergency_word);
        LinearLayoutManager manager=new LinearLayoutManager(context);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        manager.scrollToPosition(0);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);//sil

        Adapter_for_emergency_word adapter=new Adapter_for_emergency_word(mData,context);
        recyclerView.setAdapter(adapter);
        tr=getResources().getStringArray(R.array.word_tr);
        eng=getResources().getStringArray(R.array.word_eng);

        for (int i=0;i<tr.length;i++){
           mData.add(new DataEmergencyWord(tr[i],eng[i]));
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
