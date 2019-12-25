package com.example.fu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter_Erasmus_at_FU extends RecyclerView.Adapter<Adapter_Erasmus_at_FU.ViewHolder> {
    ArrayList<Data_Erasmus_at_fu> mDataList = new ArrayList<>();
    LayoutInflater layoutInflater;
    Context context;

    public Adapter_Erasmus_at_FU(ArrayList<Data_Erasmus_at_fu> mDataList, Context context) {
        this.mDataList = mDataList;
        this.context = context;

    }

    @NonNull
    @Override//herbir satır için temsil edilecek satır
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_erasmus_at_fu, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if (mDataList.get(position).getErasmus_at_fu_txt1() !=null) {
            holder.erasmus_at_fu_txt1.setText(mDataList.get(position).getErasmus_at_fu_txt1());
        }
        if (mDataList.get(position).getErasmus_at_fu_txt2() != null) {
            holder.erasmus_at_fu_txt2.setText(mDataList.get(position).getErasmus_at_fu_txt2());
        }

        if (mDataList.get(position).getErasmus_at_fu_txt3() !=null) {
            holder.erasmus_at_fu_txt3.setText(mDataList.get(position).getErasmus_at_fu_txt3());
        }
        if (mDataList.get(position).getErasmus_at_fu_txt4() !=null) {
            holder.erasmus_at_fu_txt4.setText(mDataList.get(position).getErasmus_at_fu_txt4());
        }

        if (mDataList.get(position).getErasmus_at_fu_txt5() !=null) {
            holder.erasmus_at_fu_txt5.setText(mDataList.get(position).getErasmus_at_fu_txt5());
        }

        if (mDataList.get(position).getErasmus_at_fu_txt6() !=null) {
            holder.erasmus_at_fu_txt6.setText(mDataList.get(position).getErasmus_at_fu_txt6());
        }

        if (mDataList.get(position).getErasmus_at_fu_txt7() !=null) {
            holder.erasmus_at_fu_txt7.setText(mDataList.get(position).getErasmus_at_fu_txt7());
        }
        if (mDataList.get(position).getErasmus_at_fu_txt8() !=null) {
            holder.erasmus_at_fu_txt8.setText(mDataList.get(position).getErasmus_at_fu_txt8());
        }

        if (mDataList.get(position).getErasmus_at_fu_txt9()!=null) {
            holder.erasmus_at_fu_txt9.setText(mDataList.get(position).getErasmus_at_fu_txt9());
        }

        if (mDataList.get(position).getErasmus_at_fu_txt9() !=null) {
            holder.erasmus_at_fu_txt9.setText(mDataList.get(position).getErasmus_at_fu_txt9());
        }
        if (mDataList.get(position).getErasmus_at_fu_txt10() !=null) {
            holder.erasmus_at_fu_txt10.setText(mDataList.get(position).getErasmus_at_fu_txt10());
        }

    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView erasmus_at_fu_txt1, erasmus_at_fu_txt2,
                erasmus_at_fu_txt3, erasmus_at_fu_txt4,
                erasmus_at_fu_txt5, erasmus_at_fu_txt6,
                erasmus_at_fu_txt7, erasmus_at_fu_txt8,
                erasmus_at_fu_txt9, erasmus_at_fu_txt10;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            erasmus_at_fu_txt1 = itemView.findViewById(R.id.erasmus_at_fu_txt1);
            erasmus_at_fu_txt2 = itemView.findViewById(R.id.erasmus_at_fu_txt2);
            erasmus_at_fu_txt3 = itemView.findViewById(R.id.erasmus_at_fu_txt3);
            erasmus_at_fu_txt4 = itemView.findViewById(R.id.erasmus_at_fu_txt4);
            erasmus_at_fu_txt5 = itemView.findViewById(R.id.erasmus_at_fu_txt5);
            erasmus_at_fu_txt6 = itemView.findViewById(R.id.erasmus_at_fu_txt6);
            erasmus_at_fu_txt7 = itemView.findViewById(R.id.erasmus_at_fu_txt7);
            erasmus_at_fu_txt8 = itemView.findViewById(R.id.erasmus_at_fu_txt8);
            erasmus_at_fu_txt9 = itemView.findViewById(R.id.erasmus_at_fu_txt9);
            erasmus_at_fu_txt10 = itemView.findViewById(R.id.erasmus_at_fu_txt10);


        }
    }
}
