package com.example.wireframeapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BakeryAdapter extends RecyclerView.Adapter<BakeryAdapter.ViewHolder> {
    private List<BakeryItem> items;

    public BakeryAdapter(List<BakeryItem> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bakery, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        BakeryItem it = items.get(position);
        holder.name.setText(it.getName());
        holder.img.setImageResource(it.getImageRes());
    }

    @Override
    public int getItemCount() { return items.size(); }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView name;
        ViewHolder(View v) {
            super(v);
            img = v.findViewById(R.id.itemImage);
            name = v.findViewById(R.id.itemName);
        }
    }
}
