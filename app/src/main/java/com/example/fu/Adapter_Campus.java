package com.example.fu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter_Campus extends RecyclerView.Adapter<Adapter_Campus.ViewHolder> {
    ArrayList<Data_Campus> mDataList = new ArrayList<>();
    LayoutInflater layoutInflater;
    Context context;

    public Adapter_Campus(ArrayList<Data_Campus> mDataList, Context context) {
        this.mDataList = mDataList;
        this.context = context;

    }

    @NonNull
    @Override//herbir satır için temsil edilecek satır
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_campus, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if (mDataList.get(position).getCampus_txt1() !=null) {
            holder.campus_txt1.setText(mDataList.get(position).getCampus_txt1());
        }
        if (mDataList.get(position).getCampus_tx2() != null) {
            holder.campus_tx2.setText(mDataList.get(position).getCampus_tx2());
        }

        if (mDataList.get(position).getCampus_txt3() !=null) {
            holder.campus_txt3.setText(mDataList.get(position).getCampus_txt3());
        }
        if (mDataList.get(position).getCampus_txt4() !=null) {
            holder.campus_txt4.setText(mDataList.get(position).getCampus_txt4());
        }

        if (mDataList.get(position).getCampus_txt5() !=null) {
            holder.campus_txt5.setText(mDataList.get(position).getCampus_txt5());
        }

    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView  campus_txt1, campus_tx2,
        campus_txt3, campus_txt4,
        campus_txt5;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            campus_txt1 = itemView.findViewById(R.id.campus_txt1);
            campus_tx2 = itemView.findViewById(R.id.campus_txt2);
            campus_txt3 = itemView.findViewById(R.id.campus_txt3);
            campus_txt4 = itemView.findViewById(R.id.campus_txt4);
            campus_txt5 = itemView.findViewById(R.id.campus_txt5);



        }
    }
}
