package com.example.fu;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class About_faculties extends AppCompatActivity  {

    ListView list_of_faculty;
    String []Faculty_names;
    String []Descriptipn;
    int [] images_of_faculty={R.mipmap.education,R.mipmap.science,R.mipmap.humanities,R.mipmap.economics,
                              R.mipmap.religion,R.mipmap.communication,R.mipmap.engineering,R.mipmap.healt_science,
                              R.mipmap.fisheries,R.mipmap.sports,R.mipmap.technology,R.mipmap.architecture,
                              R.mipmap.medicine,R.mipmap.dentistry,R.mipmap.vet_medicine};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_faculties);

        Faculty_names=getResources().getStringArray(R.array.faculiesname);
        Descriptipn=getResources().getStringArray(R.array.faculies_descpriction);
        list_of_faculty=(ListView) findViewById(R.id.faculties_listview);

        Faculty_custom_Listview custom_adapter=new Faculty_custom_Listview(this,Faculty_names,Descriptipn,images_of_faculty);
        list_of_faculty.setAdapter(custom_adapter);
        ActionBar actionBar = getSupportActionBar();
        String title_name=getString(R.string.faculties);
        getSupportActionBar().setTitle(title_name);
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        list_of_faculty.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(About_faculties.this,DataActivity.class);
                if(i==0){

                    intent.putExtra("key",0);
                    startActivity(intent);
                    //DataActivity.class ta bunu almak için
                    //Bundle extras = getIntent().getExtras();
                    //String value = extras.getString("send_string");
                }else if(i==1){
                    intent.putExtra("key",1);
                    startActivity(intent);
                }else if(i==2){
                    intent.putExtra("key",2);
                    startActivity(intent);
                }else if(i==3){
                    intent.putExtra("key",3);
                    startActivity(intent);
                }else if(i==4){
                    intent.putExtra("key",4);
                    startActivity(intent);
                }else if(i==5){
                    intent.putExtra("key",5);
                    startActivity(intent);
                }else if(i==6){
                    intent.putExtra("key",6);
                    startActivity(intent);
                }else if(i==7){
                    intent.putExtra("key",7);
                    startActivity(intent);
                }else if(i==8){
                    intent.putExtra("key",8);
                    startActivity(intent);
                }else if(i==9){
                    intent.putExtra("key",9);
                    startActivity(intent);
                }else if(i==10){
                    intent.putExtra("key",10);
                    startActivity(intent);
                }else if(i==11){
                    intent.putExtra("key",11);
                    startActivity(intent);
                }else if(i==12){
                    intent.putExtra("key",12);
                    startActivity(intent);
                }else if(i==13){
                    intent.putExtra("key",13);
                    startActivity(intent);
                }else if(i==14){
                    intent.putExtra("key",14);
                    startActivity(intent);
                }
            }
        });
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
