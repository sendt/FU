package com.example.fu;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import com.github.clans.fab.FloatingActionMenu;
import com.github.clans.fab.FloatingActionButton;
//import com.google.android.material.floatingactionbutton.FloatingActionButton;

import android.view.View;



import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;

import android.view.Menu;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Uri flw;
    Intent follow;
    public static int ers;
    FloatingActionMenu floatingActionMenu;
    FloatingActionButton facebook,instagram,twitter,phone,mail;

    Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ContactUs contactUs_fragment = new ContactUs();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.linearLayout, contactUs_fragment).commit();

        floatingActionMenu=findViewById(R.id.fab);
        facebook=findViewById(R.id.fab_face);
        instagram=findViewById(R.id.fab_instagram);
        twitter=findViewById(R.id.fab_twitter);
        phone=findViewById(R.id.fab_phone);
        mail=findViewById(R.id.fab_email);

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                follow = new Intent(Intent.ACTION_DIAL);
                follow.setData(Uri.parse("tel: +90 424 237 89 84"));
                startActivity(follow);
            }
        });
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String to[] = {"erasmus@firat.edu.tr"};
                follow = new Intent(Intent.ACTION_SEND);
                follow.setData(Uri.parse("mailto:"));
                follow.putExtra(Intent.EXTRA_EMAIL, to);
                follow.putExtra(Intent.EXTRA_SUBJECT, "To International Office");
                follow.putExtra(Intent.EXTRA_TEXT, "Hello International Relations Office;\n");
                follow.setType("message/rfc822");
                startActivity(Intent.createChooser(follow, "Choose an Email app :"));
            }
        });
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  flw=Uri.parse("fb://facewebmodal/f?href=" + "https://www.facebook.com/erasmusfirat");
               // follow=new Intent(Intent.ACTION_VIEW,flw);
               // startActivity(follow);
                startActivity  ( newFacebookIntent(context.getPackageManager(), "https://www.facebook.com/erasmusfirat"));
            }
        });

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flw=Uri.parse("https://www.instagram.com/firaterasmusoffice/");
                follow=new Intent(Intent.ACTION_VIEW,flw);
                follow.setPackage("com.instagram.android");
                startActivity(follow);
            }
        });
        twitter.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //twitter linkhttps://twitter.com/erasmusfirat
               startActivity(newTwitterIntent(context.getPackageManager(),"https://twitter.com/erasmusfirat"));

            }
        });


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {

            startActivity(new Intent(this, AboutFu_layout.class));
        } else if (id == R.id.emergency_number) {
            startActivity(new Intent(this, Emergency.class));

        } else if (id == R.id.emergency_wordd) {
            startActivity(new Intent(this, Emergency_word.class));

        } else if (id == R.id.nav_share) {

            Intent myintent=new Intent(Intent.ACTION_SEND);
            myintent.setType("text/plain");
            String shareBody="For International students ";
            String shareSub="FU APP";
            myintent.putExtra(Intent.EXTRA_SUBJECT,shareBody);
            myintent.putExtra(Intent.EXTRA_TEXT,shareSub);
            startActivity(Intent.createChooser(myintent,"Share using"));
        } else if (id == R.id.nav_contactus) {
            ContactUs contactUs_fragment = new ContactUs();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.linearLayout, contactUs_fragment).commit();
            ers = -2;
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public static Intent newFacebookIntent(PackageManager pm, String url) {
        Uri uri = Uri.parse(url);
        try {
            ApplicationInfo applicationInfo = pm.getApplicationInfo("com.facebook.katana", 0);
            if (applicationInfo.enabled) {
                // http://stackoverflow.com/a/24547437/1048340
                uri = Uri.parse("fb://facewebmodal/f?href=" + url);
            }
        } catch (PackageManager.NameNotFoundException ignored) {
        }
        return new Intent(Intent.ACTION_VIEW, uri);
    }

    public static Intent newTwitterIntent(PackageManager pm, String url) {
        Uri uri = Uri.parse(url);
        try {
            ApplicationInfo applicationInfo = pm.getApplicationInfo("com.twitter.android", 0);
            if (applicationInfo.enabled) {
                // http://stackoverflow.com/a/24547437/1048340      https://twitter.com/erasmusfirat
                uri = Uri.parse("https://twitter.com/erasmusfirat");
            }
        } catch (PackageManager.NameNotFoundException ignored) {
        }
        return new Intent(Intent.ACTION_VIEW, uri);
    }



}
