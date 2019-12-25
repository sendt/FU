package com.example.fu;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;



public class Adapter_for_emergency_number extends RecyclerView.Adapter<Adapter_for_emergency_number.ViewHolder> {

    ArrayList<DataEmergency> dataEmergencies = new ArrayList<>();
    LayoutInflater layoutInflater;
    Context context;
    Intent intent = new Intent(Intent.ACTION_DIAL);

    public interface RecyclerViewClickListener {

        void onClick(View view, int position);
    }
    public Adapter_for_emergency_number(ArrayList<DataEmergency> dataEmergencies, Context context) {
        this.dataEmergencies = dataEmergencies;
        this.context = context;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutInflater = LayoutInflater.from(context);
        View v = layoutInflater.inflate(R.layout.emergency_number_list_item, parent, false);
        ViewHolder vh = new ViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        holder.emergencynumber.setText(dataEmergencies.get(position).number);
        holder.emergencydesp.setText(dataEmergencies.get(position).num_desp);
        holder.imageView.setImageResource(dataEmergencies.get(position).getImgSrc());
        holder.btn.setImageResource(dataEmergencies.get(position).getCall());
        holder.getAdapterPosition();
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (holder.itemView.getId() == R.id.btn_call | position == 0) {
                    intent.setData(Uri.parse("tel:112"));
                    context.startActivity(intent);
                } else if (holder.itemView.getId() == R.id.btn_call | position == 1) {
                    intent.setData(Uri.parse("tel:110"));
                    context.startActivity(intent);
                } else if (holder.itemView.getId() == R.id.btn_call | position == 2) {
                    intent.setData(Uri.parse("tel:155"));
                    context.startActivity(intent);
                } else if (holder.itemView.getId() == R.id.btn_call | position == 3) {
                    intent.setData(Uri.parse("tel:158"));
                    context.startActivity(intent);
                } else if (holder.itemView.getId() == R.id.btn_call | position == 4) {
                    intent.setData(Uri.parse("tel:177"));
                    context.startActivity(intent);
                } else if (holder.itemView.getId() == R.id.btn_call | position == 5) {
                    intent.setData(Uri.parse("tel:183"));
                    context.startActivity(intent);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataEmergencies.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {


///intent.setData(Uri.parse("tel:0123456789"));
        //     startActivity(intent);

        TextView emergencynumber, emergencydesp;
        ImageView imageView;
        ImageView btn;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            emergencynumber = itemView.findViewById(R.id.emergency_number);
            emergencydesp = itemView.findViewById(R.id.emergency_descpt);
            imageView = itemView.findViewById(R.id.emergency_img);
            btn = itemView.findViewById(R.id.btn_call);




        }


    }

}
