package com.example.fu;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class Adapter_for_emergency_word extends RecyclerView.Adapter<Adapter_for_emergency_word.ViewHolder> {

    ArrayList<DataEmergencyWord> dataEmergenciesword = new ArrayList<>();
    LayoutInflater layoutInflater;
    Context context;
    Intent intent = new Intent(Intent.ACTION_DIAL);

    public interface RecyclerViewClickListener {

        void onClick(View view, int position);
    }
    public Adapter_for_emergency_word(ArrayList<DataEmergencyWord> dataEmergenciesword, Context context) {
        this.dataEmergenciesword = dataEmergenciesword;
        this.context = context;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutInflater = LayoutInflater.from(context);
        View v = layoutInflater.inflate(R.layout.item_emergency_word, parent, false);
        ViewHolder vh = new ViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        holder.word_tr.setText(dataEmergenciesword.get(position).word_tr);
        holder.word_eng.setText(dataEmergenciesword.get(position).word_eng);
    }

    @Override
    public int getItemCount() {
        return dataEmergenciesword.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {


///intent.setData(Uri.parse("tel:0123456789"));
        //     startActivity(intent);

        TextView  word_tr,word_eng;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            word_tr = itemView.findViewById(R.id.emergency_tr_word);
            word_eng = itemView.findViewById(R.id.emergency_en_word);

        }


    }

}
