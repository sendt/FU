package com.example.fu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter_Rankings extends RecyclerView.Adapter<Adapter_Rankings.ViewHolder> {
        ArrayList<Data_Rankings> mDataList=new ArrayList<>();
        LayoutInflater layoutInflater;
        Context context;

    public Adapter_Rankings(ArrayList<Data_Rankings> mDataList, Context context) {
        this.mDataList = mDataList;
        this.context = context;

    }

    @NonNull
    @Override//herbir satır için temsil edilecek satır
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutInflater=LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_in_rankings, parent, false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title1.setText(mDataList.get(position).getTitle1());
        holder.descp1.setText(mDataList.get(position).getDescp1());
        holder.link1.setText(mDataList.get(position).getLink1());
        holder.title2.setText(mDataList.get(position).getTitle2());
        holder.descp2.setText(mDataList.get(position).getDescp2());
        holder.link2.setText(mDataList.get(position).getLink2());
        holder.link3.setText(mDataList.get(position).getLink3());
        holder.title3.setText(mDataList.get(position).getTitle3());
        holder.descp3.setText(mDataList.get(position).getDescp3());
        holder.link4.setText(mDataList.get(position).getLink4());
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    class ViewHolder  extends RecyclerView.ViewHolder{
        TextView title1,descp1,link1,
                title2,descp2,link2,link3,
                title3,descp3,link4;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title1 = itemView.findViewById(R.id.ranking_item_title1);
            descp1 = itemView.findViewById(R.id.ranking_item_descp1);
            link1 = itemView.findViewById(R.id.ranking_item_link);
            title2 = itemView.findViewById(R.id.ranking_item_title2);
            descp2 = itemView.findViewById(R.id.ranking_item_descp2);
            link2 = itemView.findViewById(R.id.ranking_item_link2);
            link3 = itemView.findViewById(R.id.ranking_item_link3);
            title3 = itemView.findViewById(R.id.ranking_item_title3);
            descp3 = itemView.findViewById(R.id.ranking_item_descp3);
            link4 = itemView.findViewById(R.id.ranking_item_link4);

        }
    }
}
