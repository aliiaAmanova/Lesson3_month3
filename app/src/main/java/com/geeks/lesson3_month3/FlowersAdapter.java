package com.geeks.lesson3_month3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FlowersAdapter extends RecyclerView.Adapter<FlowersViewHolder> {

    private ArrayList<String> flowersList;

    public FlowersAdapter(ArrayList<String> flowersList) {
        this.flowersList = flowersList;
    }

    @NonNull
    @Override
    public FlowersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FlowersViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_flowers,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull FlowersViewHolder holder, int position) {
       holder.onBind(flowersList.get(position));
    }

    @Override
    public int getItemCount() {
        return flowersList.size();
    }
}
