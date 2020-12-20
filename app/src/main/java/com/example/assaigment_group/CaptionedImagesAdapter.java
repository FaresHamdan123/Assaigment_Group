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

public class CaptionedImagesAdapter extends RecyclerView.Adapter<ViewHolder> {

    private String[] captions;
    private int[] imageIds;
    private String[] Edition;
    private String[] ISBN;
    private ClickListener recycleViewOnItemClick;

    public CaptionedImagesAdapter(String[] captions,  String[] edition, int[] imageIds,String[] ISBN, ClickListener recycleViewOnItemClick) {
        this.captions = captions;
        this.imageIds = imageIds;
        Edition = edition;
        this.ISBN = ISBN;
        this.recycleViewOnItemClick = recycleViewOnItemClick;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView v = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);

        return new ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        CardView cardView = (CardView) holder.itemView;
        ImageView imageView = (ImageView) cardView.findViewById(R.id.image);
        Drawable dr = ContextCompat.getDrawable(cardView.getContext(), imageIds[position]);
        imageView.setImageDrawable(dr);
        TextView txt = (TextView)cardView.findViewById(R.id.Name);
        TextView d = (TextView)cardView.findViewById(R.id.Edition);
        TextView l = (TextView)cardView.findViewById(R.id.ISBN);
        txt.setText(captions[position]);
        d.setText(Edition[position]);
        l.setText(ISBN[position]);
    }

    @Override
    public int getItemCount(){
        return captions.length;
    }

    public  class ViewHolder extends RecyclerView.ViewHolder
    {
        private CardView cardView;
        public ViewHolder(CardView cardView){
            super(cardView);
            this.cardView = cardView;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    recycleViewOnItemClick.onItemClick(getBindingAdapterPosition());
                }
            });
        }
    }
}
