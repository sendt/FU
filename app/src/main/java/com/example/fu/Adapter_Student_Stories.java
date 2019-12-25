package com.example.fu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter_Student_Stories extends RecyclerView.Adapter<Adapter_Student_Stories.ViewHolder> {
    ArrayList<Data_Student_Stories> mDataList = new ArrayList<>();
    LayoutInflater layoutInflater;
    Context context;

    public Adapter_Student_Stories(ArrayList<Data_Student_Stories> mDataList, Context context) {
        this.mDataList = mDataList;
        this.context = context;

    }

    @NonNull
    @Override//herbir satır için temsil edilecek satır
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_student_stories, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        if (mDataList.get(position).getStories_title_name() != "") {
            holder.stories_title_name.setText(mDataList.get(position).getStories_title_name());
        }
        if (mDataList.get(position).getStories_names_country() != "") {
            holder.stories_names_country.setText(mDataList.get(position).getStories_names_country());
        }

        if (mDataList.get(position).getStories_p1() != "") {
            holder.stories_p2.setText(mDataList.get(position).getStories_p1());
        }
        holder.stories_p1.setText(mDataList.get(position).getStories_p1());
        if (mDataList.get(position).getStories_p2() != "") {
            holder.stories_p2.setText(mDataList.get(position).getStories_p2());
        }

        if (mDataList.get(position).getStories_p3() != "") {
            holder.stories_p3.setText(mDataList.get(position).getStories_p3());
        }
        if (mDataList.get(position).getStories_p4() != "") {
            holder.stories_p4.setText(mDataList.get(position).getStories_p4());
        }
        if (mDataList.get(position).getStories_p5() != "") {
            holder.stories_p5.setText(mDataList.get(position).getStories_p5());
        }


    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView stories_title_name, stories_names_country,
                stories_p1, stories_p2, stories_p3, stories_p4, stories_p5;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            stories_title_name = itemView.findViewById(R.id.stories_title_name);
            stories_names_country = itemView.findViewById(R.id.storie_names_country);
            stories_p1 = itemView.findViewById(R.id.stories_p1);
            stories_p2 = itemView.findViewById(R.id.stories_p2);
            stories_p3 = itemView.findViewById(R.id.stories_p3);
            stories_p4 = itemView.findViewById(R.id.stories_p4);
            stories_p5 = itemView.findViewById(R.id.stories_p5);


        }
    }
}
