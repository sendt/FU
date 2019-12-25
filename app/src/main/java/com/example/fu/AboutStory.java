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

public class AboutStory extends AppCompatActivity {

    ArrayList<Data_Student_Stories> data_student_stories = new ArrayList<>();
    RecyclerView recyclerView;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_story);

        data_student_stories.add(new Data_Student_Stories(
                getResources().getString(R.string.stories_title_name1),
                getResources().getString(R.string.stories_names_country1),  //for first student
                getResources().getString(R.string.stories_p1_1),
                getResources().getString(R.string.stories_p1_2),
                getResources().getString(R.string.stories_p1_3),        //for first student
                getResources().getString(R.string.stories_p1_4),
                getResources().getString(R.string.stories_p1_5)

        ));

        data_student_stories.add(new Data_Student_Stories(
                getResources().getString(R.string.stories_title_name2),
                getResources().getString(R.string.stories_names_country2),
                getResources().getString(R.string.stories_p2_1),
                getResources().getString(R.string.stories_p2_2),
                getResources().getString(R.string.stories_p2_3)
        )) ;

        recyclerView = findViewById(R.id.recyclerview_student_stories);
        LinearLayoutManager manager = new LinearLayoutManager(context);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        //manager.scrollToPosition(0);
        recyclerView.setLayoutManager(manager);
        //recyclerView.setHasFixedSize(true);

        Adapter_Student_Stories adapter = new Adapter_Student_Stories(data_student_stories, context);
        recyclerView.setAdapter(adapter);

        ActionBar actionBar = getSupportActionBar();
        String title_name = getString(R.string.student_story);
        getSupportActionBar().setTitle(title_name);
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

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
