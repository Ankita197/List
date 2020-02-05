package com.ankita.listviewex;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class MyListAdepter extends ArrayAdapter<String> {
    private Activity context;

    private Integer[] imgid;


    public MyListAdepter(Activity context, String[] maintitle, String[] subtitle, Integer[] imgid, String[] price) {
        super(context, R.layout.my_list, maintitle);
        this.context = context;
        this.imgid = imgid;


    }


    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.my_list, null, true);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView);
        imageView.setImageResource(imgid[position]);

        return rowView;

    }
}

