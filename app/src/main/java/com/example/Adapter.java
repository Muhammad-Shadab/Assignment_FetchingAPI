package com.example;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment.Data;
import com.example.assignment.R;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.holder> {

    List<Data> dataList;

    public Adapter(List<Data> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        Data currentPosition = dataList.get(position);
        holder.textView.setText(currentPosition.getName());
        holder.textView2.setText(currentPosition.getEmail());
        holder.textView3.setText(currentPosition.getGender());
        if (currentPosition.getStatus().equals("active"))
        {
            holder.textView4.setText(currentPosition.getStatus());
            holder.textView4.setTextColor(Color.parseColor("#319108"));
        }
        else
        {
            holder.textView4.setTextColor(Color.parseColor("#FF0000"));
            holder.textView4.setText(currentPosition.getStatus());
        }


    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class holder extends RecyclerView.ViewHolder{

    TextView textView, textView2, textView3, textView4;

        public holder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            textView2 = itemView.findViewById(R.id.textView2);
            textView3 = itemView.findViewById(R.id.textView3);
            textView4 = itemView.findViewById(R.id.textView4);
        }
    }
}
