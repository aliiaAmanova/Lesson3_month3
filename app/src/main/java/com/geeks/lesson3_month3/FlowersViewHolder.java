package com.geeks.lesson3_month3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FlowersViewHolder extends RecyclerView.ViewHolder {
    private TextView tvFlowers;
    public FlowersViewHolder(@NonNull View itemView) {
        super(itemView);
        tvFlowers = itemView.findViewById(R.id.tv_flowers);
    }


    public void onBind(String flowersName){
        tvFlowers.setText(flowersName);
    }
}
