package com.example.fu;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class AboutFu_layout extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView list;
    String[] aboutfu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_fu_layout);


        aboutfu = getResources().getStringArray(R.array.aboutfulist);
        list=findViewById(R.id.aboutfulist1);
        ArrayAdapter<String> adapter=
                new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,aboutfu);
        list.setAdapter(adapter);

        list.setOnItemClickListener(this);
        ActionBar actionBar = getSupportActionBar();
        String title_name= getString(R.string.about_FU);
        getSupportActionBar().setTitle(title_name);
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
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

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
       if (i==0){
           Intent intent = new Intent(AboutFu_layout.this,DataActivity.class);
           intent.putExtra("key",15);
           startActivity(intent);
       }
           else if (i==1){

               startActivity(new Intent(this,About_faculties.class));

       }else if(i==2){
           startActivity(new Intent(this,About_ranking.class));
       }else if(i==3){
           startActivity(new Intent(this,AboutCampus.class));
       }else if(i==4){
           startActivity(new Intent(this,AboutStory.class));
       }else if(i==5){
           startActivity(new Intent(this,AboutErasmusAt.class));
       }else if(i==6){
           startActivity(new Intent(this,AboutDownloads.class));
       }




    }
}
