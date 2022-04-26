package com.example.chatactivity.activity;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chatactivity.R;

import java.util.ArrayList;

public class UserAdpter extends RecyclerView.Adapter<UserAdpter.myviewHolder> {
    Context context;
    ArrayList<UserModel> list;



    public UserAdpter(Context context, ArrayList<UserModel> list) {
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public myviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_item,parent,false);
        return new myviewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull myviewHolder holder, int position) {
        UserModel userModel = list.get(position);
        holder.name.setText(userModel.getName());
//        holder.mobile_no.setText(userModel.getMobile_no());
//        holder.email.setText(userModel.getEmail());
//        holder.password.setText(userModel.getPassword());

        holder.cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,ChatActivity.class);
                context.startActivity(intent);

            }
        });

    }




    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class myviewHolder extends RecyclerView.ViewHolder{
        TextView name,mobile_no,email,password;
        LinearLayout cardview;

        public myviewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
//            mobile_no = itemView.findViewById(R.id.mobileno1);
//            email = itemView.findViewById(R.id.email1);
//            password = itemView.findViewById(R.id.password1);
            cardview = itemView.findViewById(R.id.cardview);
        }
    }


}
