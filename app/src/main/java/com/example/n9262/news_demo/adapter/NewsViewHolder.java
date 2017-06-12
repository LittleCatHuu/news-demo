package com.example.n9262.news_demo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.n9262.news_demo.R;

/**
 * Created by n9262 on 2017/6/11.
 */
public class NewsViewHolder extends RecyclerView.ViewHolder {
    ImageView imgView;
    TextView titleView;
    View view;


    public NewsViewHolder(View itemView) {
        super(itemView);
        view = itemView;
        imgView = (ImageView) itemView.findViewById(R.id.item_img);
        titleView = (TextView) itemView.findViewById(R.id.item_title);
    }
}
