package com.example.wireframeapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BakeryAdapter extends RecyclerView.Adapter<BakeryAdapter.BakeryViewHolder> {

    private List<BakeryItem> bakeryList;

    public BakeryAdapter(List<BakeryItem> bakeryList) {
        this.bakeryList = bakeryList;
    }

    @NonNull
    @Override
    public BakeryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_bakery, parent, false);
        return new BakeryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BakeryViewHolder holder, int position) {
        BakeryItem item = bakeryList.get(position);
        holder.name.setText(item.getName());
        holder.image.setImageResource(item.getImageResId());
    }

    @Override
    public int getItemCount() {
        return bakeryList.size();
    }

    public static class BakeryViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView image;

        public BakeryViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.bakeryName);
            image = itemView.findViewById(R.id.bakeryImage);
        }
    }
}
