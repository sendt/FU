package com.example.fu;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class DataActivity extends AppCompatActivity {
    String url;
    Intent intent,web;
    double xx,yy;
    RecyclerView recyclerView;
    Context context = this;
    int img;
    public  static  int whichfaculty=-1;
    String title;
    String descp;
    ImageView vi;
    FloatingActionButton fab_map,web_map;
    ArrayList<HoldDataforRecyclerView> hold = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        web=new Intent(Intent.ACTION_VIEW);
        Bundle extras = getIntent().getExtras();
        vi = findViewById(R.id.change);
        whichfaculty = (getIntent().getExtras().getInt("key"));

        intent=new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        fab_map=findViewById(R.id.fab_map);
        web_map=findViewById(R.id.fab_web);
        recyclerView = findViewById(R.id.list_item_recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        fab_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(DataActivity.this, MainActivity.class);
                DataActivity.this.startActivity(myIntent);
            }
        });

        web_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(web);
            }
        });


        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        //linearLayoutManager.scrollToPosition(0);  //değişebiklir
        recyclerView.setLayoutManager(linearLayoutManager);

        //  recyclerView.setHasFixedSize(true); //değişebiklir

        AdapterForRecyclerView1 adapter = new AdapterForRecyclerView1(hold, context);
        recyclerView.setAdapter(adapter);


        if (whichfaculty == 15) {
            title = getString(R.string.firat_univ);
            descp = getString(R.string.descp_firat_univ);
            hold.add(new HoldDataforRecyclerView(R.mipmap.fu_logo, title, descp));
            title=getString(R.string.descp_firat_univ_1);
            hold.add(new HoldDataforRecyclerView(title));
            url="http://www.firat.edu.tr/en";
            web.setData(Uri.parse(url));
            vi.setImageResource(R.drawable.f_u_desp_r);
            actionBar.setTitle(R.string.firat_univ);
        }

        if (whichfaculty == 0) {
            title = getString(R.string.faculty_education);
            descp = getString(R.string.descp_faculty_education);
            hold.add(new HoldDataforRecyclerView(R.mipmap.education, title, descp));
            vi.setImageResource(R.drawable.education_desp_r);
            url="http://egt.firat.edu.tr/";
            web.setData(Uri.parse(url));
            actionBar.setTitle(R.string.firat_univ);
        }
        if (whichfaculty == 1) {
            xx=38.6810398;
            yy=39.2015744;
            title = getString(R.string.faculty_science);
            descp = getString(R.string.descp_faculty_science);
            hold.add(new HoldDataforRecyclerView(R.mipmap.science, title, descp));
            vi.setImageResource(R.drawable.science_desp_r);
            url="http://fbe.firat.edu.tr/";
            web.setData(Uri.parse(url));
            actionBar.setTitle(R.string.firat_univ);
        } else if (whichfaculty == 2) {
            title = getString(R.string.faculty_humanity);
            descp = getString(R.string.descp_faculty_humanities);
            hold.add(new HoldDataforRecyclerView(R.mipmap.humanities, title, descp));
            vi.setImageResource(R.drawable.humanity_desp_r);
            url="http://www.firat.edu.tr/tr/akademik/fakulteler/insani-ve-sosyal-bilimler-fakultesi";
            web.setData(Uri.parse(url));
            actionBar.setTitle(R.string.firat_univ);
        } else if (whichfaculty == 3) {
            title = getString(R.string.faculty_economic);
            descp = getString(R.string.descp_faculty_economic);
            hold.add(new HoldDataforRecyclerView(R.mipmap.economics, title, descp));
            vi.setImageResource(R.drawable.economic_desp_r);
            url="http://iib.firat.edu.tr/";
            web.setData(Uri.parse(url));
            actionBar.setTitle(R.string.firat_univ);
        } else if (whichfaculty == 4) {
            title = getString(R.string.faculty_theology);
            descp = getString(R.string.descp_faculty_theology);
            hold.add(new HoldDataforRecyclerView(R.mipmap.religion, title, descp));
            vi.setImageResource(R.drawable.theology_desp_r);
            url="http://ilahiyat.firat.edu.tr/";
            web.setData(Uri.parse(url));
            actionBar.setTitle(R.string.firat_univ);
        } else if (whichfaculty == 5) {
            title = getString(R.string.faculty_communication);
            descp = getString(R.string.descp_faculty_communication);
            hold.add(new HoldDataforRecyclerView(R.mipmap.communication, title, descp));
            vi.setImageResource(R.drawable.communication_desp_r);
            url="http://iletisim.firat.edu.tr/en";
            web.setData(Uri.parse(url));
            actionBar.setTitle(R.string.firat_univ);
        } else if (whichfaculty == 6) {
            title = getString(R.string.faculty_engineering);
            descp = getString(R.string.descp_faculty_engineering);
            hold.add(new HoldDataforRecyclerView(R.mipmap.engineering, title, descp));
            vi.setImageResource(R.drawable.engineering_desp_r);
            url="http://muh.firat.edu.tr/";
            web.setData(Uri.parse(url));
            actionBar.setTitle(R.string.firat_univ);
        } else if (whichfaculty == 7) {
            title = getString(R.string.faculty_health);
            descp = getString(R.string.descp_faculty_health);
            hold.add(new HoldDataforRecyclerView(R.mipmap.healt_science, title, descp));
            vi.setImageResource(R.drawable.f_u_desp_r);
            url="http://www.firat.edu.tr/tr/akademik/fakulteler/saglik-bilimleri-fakultesi";
            web.setData(Uri.parse(url));
            actionBar.setTitle(R.string.firat_univ);
        } else if (whichfaculty == 8) {
            title = getString(R.string.faculty_fisher);
            descp = getString(R.string.descp_faculty_fisheries);
            hold.add(new HoldDataforRecyclerView(R.mipmap.fisheries, title, descp));
            vi.setImageResource(R.drawable.f_u_desp_r);
            url="http://web.firat.edu.tr/suurunleri/";
            web.setData(Uri.parse(url));
            actionBar.setTitle(R.string.firat_univ);
        } else if (whichfaculty == 9) {
            title = getString(R.string.faculty_sport);
            descp = getString(R.string.descp_faculty_sport);
            hold.add(new HoldDataforRecyclerView(R.mipmap.sports, title, descp));
            vi.setImageResource(R.drawable.sport_desp_r);
            url="http://sb.firat.edu.tr/";
            web.setData(Uri.parse(url));
            actionBar.setTitle(R.string.firat_univ);
        } else if (whichfaculty == 10) {
            title = getString(R.string.faculty_technology);
            descp = getString(R.string.descp_faculty_technology);
            hold.add(new HoldDataforRecyclerView(R.mipmap.technology, title, descp));
            vi.setImageResource(R.drawable.technology_desp_r);
            url="http://tek.firat.edu.tr/";
            web.setData(Uri.parse(url));
            actionBar.setTitle(R.string.firat_univ);
        } else if (whichfaculty == 11) {
            title = getString(R.string.faculty_architecture);
            descp = getString(R.string.descp_faculty_architecture);
            hold.add(new HoldDataforRecyclerView(R.mipmap.architecture, title, descp));
            vi.setImageResource(R.drawable.f_u_desp_r);
            url="http://mimarlik.mimarlik.firat.edu.tr/";
            web.setData(Uri.parse(url));
            actionBar.setTitle(R.string.firat_univ);
        } else if (whichfaculty == 12) {
            title = getString(R.string.faculty_medicine);
            descp = getString(R.string.descp_faculty_medicine);
            hold.add(new HoldDataforRecyclerView(R.mipmap.medicine, title, descp));
            vi.setImageResource(R.drawable.medicine_desp_r);
            url="http://tip.firat.edu.tr/";
            web.setData(Uri.parse(url));
            actionBar.setTitle(R.string.firat_univ);
        } else if (whichfaculty == 13) {
            title = getString(R.string.faculty_dentis);
            descp = getString(R.string.descp_faculty_dentistry);
            hold.add(new HoldDataforRecyclerView(R.mipmap.dentistry, title, descp));
            vi.setImageResource(R.drawable.f_u_desp_r);
            url="http://dhf.firat.edu.tr/";
            web.setData(Uri.parse(url));
            actionBar.setTitle(R.string.firat_univ);
        } else if (whichfaculty == 14) {
            title = getString(R.string.faculty_veterinary);
            descp = getString(R.string.descp_faculty_veterinary);
            hold.add(new HoldDataforRecyclerView(R.mipmap.vet_medicine, title, descp));
            vi.setImageResource(R.drawable.f_u_desp_r);
            url="http://veteriner.firat.edu.tr/en";
            web.setData(Uri.parse(url));
            actionBar.setTitle(R.string.firat_univ);
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
