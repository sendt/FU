package com.example.fu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.storage.StorageReference;

import org.w3c.dom.Document;

import java.util.ArrayList;

public class AboutDownloads extends AppCompatActivity {
    FirebaseFirestore db;
    RecyclerView mRecyclerView;
    ArrayList<DownModel> downModelArrayList = new ArrayList<>();
    MyAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_downloads    );

        ActionBar actionBar = getSupportActionBar();
        String title_name=getString(R.string.downloads);
        getSupportActionBar().setTitle(title_name);
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        setUpRV();
        setUpFB();
        dataFromFirebase();


    }


    private void dataFromFirebase() {
        if(downModelArrayList.size()>0)
            downModelArrayList.clear();

        //db=FirebaseFirestore.getInstance();

        db.collection("files")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        for(DocumentSnapshot documentSnapshot: task.getResult()) {

                            DownModel downModel= new DownModel(documentSnapshot.getString("name"),
                                    documentSnapshot.getString("link"));
                            downModelArrayList.add(downModel);

                        }

                        myAdapter= new MyAdapter(AboutDownloads.this,downModelArrayList);
                        mRecyclerView.setAdapter(myAdapter);
                    }
                })

                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(AboutDownloads.this, "Error ;-.-;", Toast.LENGTH_SHORT).show();
                    }
                })
        ;


    }

    private void setUpFB(){
        db=FirebaseFirestore.getInstance();


    }

    private void setUpRV(){
        mRecyclerView= findViewById(R.id.recylerview_download);
//        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
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
