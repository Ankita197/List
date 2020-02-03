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
    private String[] maintitle;
    private String[] subtitle;
    private Integer[] imgid;
    private String[] price;

    public MyListAdepter(Activity context, String[] maintitle, String[] subtitle, Integer[] imgid, String[] price) {
        super(context, R.layout.my_list, maintitle);
        this.context = context;
        this.maintitle = maintitle;
        this.subtitle = subtitle;
        this.imgid = imgid;
        this.price = price;

    }


    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.my_list, null, true);
        TextView titleText = (TextView) rowView.findViewById(R.id.tvTitleText);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.tvDescription);
        TextView tvprice = (TextView) rowView.findViewById(R.id.tvPrice);
        titleText.setText(maintitle[position]);
        imageView.setImageResource(imgid[position]);
        subtitleText.setText(subtitle[position]);
        tvprice.setText(price[position]);
        return rowView;

    }
}

