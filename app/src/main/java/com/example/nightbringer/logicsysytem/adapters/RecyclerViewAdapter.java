package com.example.nightbringer.logicsysytem.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.nightbringer.logicsysytem.R;
import com.example.nightbringer.logicsysytem.model.Product;

import java.util.List;

/**
 * Created by Nightbringer on 6/7/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private List<Product> list;

    public RecyclerViewAdapter(List<Product> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d("Error", "4");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.text, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d("Error", "4");
        holder.title.setText(list.get(position).getTitle());
        holder.name.setText(list.get(position).getFullName());
        holder.serialNumber.setText(list.get(position).getSerialNumber());
        Log.d("Error", "4");
    }

    @Override
    public int getItemCount() {
        Log.d("Error", " " + list.size());
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public TextView name;
        public TextView serialNumber;
        public CheckBox checkBox;

        public ViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            name = itemView.findViewById(R.id.fullName);
            serialNumber = itemView.findViewById(R.id.serialNumber);
            checkBox = itemView.findViewById(R.id.check);
        }
    }
}
