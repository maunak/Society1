package com.project.loginandregistration;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class entryadapter extends RecyclerView.Adapter<com.project.loginandregistration.entryadapter.myviewholder>{
    ArrayList<entryData> datalist;
    public entryadapter(ArrayList<entryData> datalist) {
        this.datalist = datalist;}
        @NonNull
        @Override
        public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
            return new myviewholder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull myviewholder holder, int position) {
            holder.t1.setText(datalist.get(position).getName());
            holder.t2.setText(datalist.get(position).getEntryTime());
            holder.t3.setText(datalist.get(position).getBlock());
            holder.t4.setText(datalist.get(position).getVehicleNumber());
            holder.t5.setText(datalist.get(position).getPhoneNumber());
            holder.t6.setText(datalist.get(position).getDetail());

        }

        @Override
        public int getItemCount() {
            return datalist.size();
        }

        class myviewholder extends RecyclerView.ViewHolder {
            TextView t1,t2,t3,t4,t5,t6;

            public myviewholder(@NonNull View itemView) {
                super(itemView);
                t1 = itemView.findViewById(R.id.name);
                t2 = itemView.findViewById(R.id.ttime);
                t3 = itemView.findViewById(R.id.block);
                t4 = itemView.findViewById(R.id.vvehicle);
                t5 = itemView.findViewById(R.id.phone);
                t6 = itemView.findViewById(R.id.detail);
            }

        }
    }