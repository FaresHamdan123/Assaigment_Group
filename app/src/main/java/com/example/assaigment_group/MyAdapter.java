package com.example.assaigment_group;

import android.graphics.drawable.Drawable;

import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class MyAdapter extends RecyclerView.Adapter<ViewHolder> {

    private ClickListener recycleViewOnItemClick;
    private Book[] books;

    public MyAdapter(ClickListener recycleViewOnItemClick, Book[] books) {
        this.recycleViewOnItemClick = recycleViewOnItemClick;
        this.books = books;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView view = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ImageView Image = holder.itemView.findViewById(R.id.CardImage);
        Image.setImageResource(books[position].getImageID());
    }

    @Override
    public int getItemCount() {

        return books.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(CardView cardView) {
            super(cardView);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    recycleViewOnItemClick.onItemClick(getBindingAdapterPosition());
                }
            });
        }
    }
}
