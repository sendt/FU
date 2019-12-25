package com.example.fu;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView mName;
    Button mDownload;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        mName=itemView.findViewById(R.id.name_download);
        mDownload=itemView.findViewById(R.id.button_download);



    }
}