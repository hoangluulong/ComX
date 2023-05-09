package com.example.module1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PropertyListAdapter extends RecyclerView.Adapter<PropertyListAdapter.MyViewHolder> {
    Context context;

    public PropertyListAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_property_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.btnPrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, PropertyPriceManagementActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 50;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imgAvatar, btnPrice;
        TextView tvPropertyName, tvDate;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgAvatar = itemView.findViewById(R.id.imgAvatar);
            btnPrice = itemView.findViewById(R.id.btnPrice);
            tvPropertyName = itemView.findViewById(R.id.tvPropertyName);
            tvDate = itemView.findViewById(R.id.tvDate);
        }
    }
}
