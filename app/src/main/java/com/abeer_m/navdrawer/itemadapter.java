package com.abeer_m.navdrawer;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by abeer_m on 1/12/2018.
 */

public class itemadapter extends RecyclerView.Adapter<itemadapter.itemHolder> {
    List<items > itemlist;
    private OnItemSelecteListener mListener;
    public itemadapter( List<items> itemlist) {
        this.itemlist = itemlist;
    }
    @Override
    public itemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        itemHolder holder = new itemHolder(row);
        return holder;
    }

    @Override
    public void onBindViewHolder(itemHolder holder, int position) {

        items i = itemlist.get(position);
        holder.text.setText(i.text);
        holder.img.setImageResource(i.img);
    }

    @Override
    public int getItemCount() {
        return itemlist.size();
    }



    class itemHolder extends RecyclerView.ViewHolder {
        TextView text ;
        ImageView img;

        public itemHolder(View itemView ) {
            super(itemView);
            text= (TextView) itemView.findViewById(R.id.title);
            img = (ImageView) itemView.findViewById(R.id.icon);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mListener.onItemSelected(view, getAdapterPosition());
                }
            });
        }
    }

    public void setOnItemClickLister(OnItemSelecteListener mListener) {
        this.mListener = mListener;
    }

    public interface OnItemSelecteListener{
        public void onItemSelected(View v, int position);
    }

    }


