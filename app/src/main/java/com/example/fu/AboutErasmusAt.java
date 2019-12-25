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

public class AboutErasmusAt extends AppCompatActivity {

    ArrayList<Data_Erasmus_at_fu> data_erasmus_at_fus = new ArrayList<>();
    RecyclerView recyclerView;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_erasmus_at);

        data_erasmus_at_fus.add(new Data_Erasmus_at_fu(
                getResources().getString(R.string.erasmus_at_fu_txt1),
                getResources().getString(R.string.erasmus_at_fu_txt2),
                getResources().getString(R.string.erasmus_at_fu_txt3),
                getResources().getString(R.string.erasmus_at_fu_txt4),
                getResources().getString(R.string.erasmus_at_fu_txt5),
                getResources().getString(R.string.erasmus_at_fu_txt6),
                getResources().getString(R.string.erasmus_at_fu_txt7),
                getResources().getString(R.string.erasmus_at_fu_txt8),
                getResources().getString(R.string.erasmus_at_fu_txt9),
                getResources().getString(R.string.erasmus_at_fu_txt10)

        ));

        data_erasmus_at_fus.add(new Data_Erasmus_at_fu(
                getResources().getString(R.string.erasmus_at_fu_txt11),
                getResources().getString(R.string.erasmus_at_fu_txt12),
                getResources().getString(R.string.erasmus_at_fu_txt13),
                getResources().getString(R.string.erasmus_at_fu_txt14),
                getResources().getString(R.string.erasmus_at_fu_txt15),
                getResources().getString(R.string.erasmus_at_fu_txt16),
                getResources().getString(R.string.erasmus_at_fu_txt17)

        ));

        data_erasmus_at_fus.add(new Data_Erasmus_at_fu(

                getResources().getString(R.string.erasmus_at_fu_txt18),
                getResources().getString(R.string.erasmus_at_fu_txt19),
                getResources().getString(R.string.erasmus_at_fu_txt20),
                getResources().getString(R.string.erasmus_at_fu_txt21),
                getResources().getString(R.string.erasmus_at_fu_txt22),
                getResources().getString(R.string.erasmus_at_fu_txt23)

        ));



        recyclerView = findViewById(R.id.erasmus_at_fu_recylerview);
        LinearLayoutManager manager = new LinearLayoutManager(context);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        //manager.scrollToPosition(0);
        recyclerView.setLayoutManager(manager);
        //recyclerView.setHasFixedSize(true);

        Adapter_Erasmus_at_FU adapter = new Adapter_Erasmus_at_FU(data_erasmus_at_fus, context);
        recyclerView.setAdapter(adapter);

        ActionBar actionBar = getSupportActionBar();
        String title_name = getString(R.string.eramus_at_fu);
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
