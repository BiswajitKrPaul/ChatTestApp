package com.example.chattestapp.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chattestapp.Listeners.CustomOnClickListener;
import com.example.chattestapp.R;


public class ChatListViewHolder extends RecyclerView.ViewHolder {

    public TextView username,email;

    public ChatListViewHolder(@NonNull View itemView, final CustomOnClickListener clickListener) {
        super(itemView);
        username=itemView.findViewById(R.id.chatlist_card_name);
        email=itemView.findViewById(R.id.chatlist_card_email);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickListener.getPosition(getAdapterPosition());
            }
        });
    }

}
