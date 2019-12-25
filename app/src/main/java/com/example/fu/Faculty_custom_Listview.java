package com.example.fu;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Faculty_custom_Listview extends ArrayAdapter<String>  {
    Context context;
    String[] faculty_names;
    String[] descp;
    int[] images;

    public Faculty_custom_Listview(@NonNull Context c, String[] faculty_names, String[] descp, int[] images) {

        super(c, R.layout.for_faculty_list_one_item, R.id.faculties_name, faculty_names);
        this.context = c;
        this.faculty_names = faculty_names;
        this.descp = descp;
        this.images = images;

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View for_one_item = convertView;
        Holdingform holding = null;
        if (for_one_item == null) {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            for_one_item = inflater.inflate(R.layout.for_faculty_list_one_item, parent, false);
            holding = new Holdingform(for_one_item);
            for_one_item.setTag(holding);
        } else {
            holding = (Holdingform) for_one_item.getTag();
        }


        holding.img.setImageResource(images[position]);
        holding.name.setText(faculty_names[position]);
        holding.des.setText(descp[position]);

        return for_one_item;

    }



    class Holdingform {
        ImageView img;
        TextView name;
        TextView des;


        Holdingform(View v) {
            img = (ImageView) v.findViewById(R.id.faculties_img);
            name = (TextView) v.findViewById(R.id.faculties_name);
            des = (TextView) v.findViewById(R.id.faculties_descpription);

        }
    }
}
