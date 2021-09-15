package com.example.myrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    Context context;
    String[] countryNames,desc;
    int[] flags;

    public MyAdapter(Context context, String[] countryNames, String[] desc, int[] flags) {
        this.context = context;
        this.countryNames = countryNames;
        this.desc = desc;
        this.flags = flags;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.simple_layout,parent,false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.countryTextView.setText(countryNames[position]);
        holder.descTextView.setText(desc[position]);
        holder.flagsView.setImageResource(flags[position]);
    }

    @Override
    public int getItemCount() {
        return countryNames.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener,View.OnLongClickListener{

        TextView countryTextView,descTextView;
        ImageView flagsView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            countryTextView = itemView.findViewById(R.id.countryNamesViewId);
            descTextView = itemView.findViewById(R.id.descViewId);
            flagsView = itemView.findViewById(R.id.imageViewId);

        }

        @Override
        public void onClick(View v) {
            
        }

        @Override
        public boolean onLongClick(View v) {
            return false;
        }
    }

}
