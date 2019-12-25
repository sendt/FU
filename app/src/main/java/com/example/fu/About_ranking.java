package com.example.fu;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class About_ranking extends AppCompatActivity {
    ArrayList<Data_Rankings> data_rankings = new ArrayList<>();
    RecyclerView recyclerView;
    Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_ranking);
        data_rankings.add(new Data_Rankings(
                getResources().getString(R.string.ranking_title_1),
                getResources().getString(R.string.ranking_descp_1),
                "https://www.usnews.com/education/best-global-universities/search?region=&country=turkey&subject=engineering&name",
                getResources().getString(R.string.ranking_title_2),
                getResources().getString(R.string.ranking_descp_2),
                "https://cwur.org/2019-2020/F%C4%B1rat-University.php",
                "https://cwur.org/2019-2020.php",
                getResources().getString(R.string.ranking_title_3),
                getResources().getString(R.string.ranking_descp_3),
                "http://shanghairanking.com/ARWU2019.html"
        ));
        recyclerView=findViewById(R.id.recyclerview_rankings);
        LinearLayoutManager manager=new LinearLayoutManager(context);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        manager.scrollToPosition(0);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);

        Adapter_Rankings adapter=new Adapter_Rankings(data_rankings,context);
        recyclerView.setAdapter(adapter);

        ActionBar actionBar = getSupportActionBar();
        String title_name = getString(R.string.fu_in_rakings);
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
