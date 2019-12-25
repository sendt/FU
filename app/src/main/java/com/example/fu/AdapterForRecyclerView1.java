package com.example.fu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterForRecyclerView1 extends RecyclerView.Adapter<AdapterForRecyclerView1.ViewHolder> {
        ArrayList<HoldDataforRecyclerView> hold=new ArrayList<HoldDataforRecyclerView>();
        LayoutInflater layoutInflater;
        Context context;
        //for each one row select interface

    public AdapterForRecyclerView1(ArrayList<HoldDataforRecyclerView> hold, Context context) {
        this.hold = hold;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutInflater=LayoutInflater.from(context);
        View v=layoutInflater.inflate(R.layout.list_item_faculty_descp,parent,false);
        ViewHolder vh=new ViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if(hold.get(position).getTitle()!=""){
        holder.title.setText(hold.get(position).getTitle());}
        if(hold.get(position).getDescp()!=""){
        holder.desp.setText(hold.get(position).getDescp());}

        holder.src.setImageResource(hold.get(position).getImg_src());
        holder.ln.setTag(holder);
    }

    @Override
    public int getItemCount() {
        return hold.size();
    }

    class ViewHolder extends  RecyclerView.ViewHolder{
        ImageView src;
        TextView title,desp;
        LinearLayout ln;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            src=itemView.findViewById(R.id.list_item_img);
            title=itemView.findViewById(R.id.list_item_title);
            desp=itemView.findViewById(R.id.list_item_descp);
            ln=itemView.findViewById(R.id.cardView1);
        }
    }

}
