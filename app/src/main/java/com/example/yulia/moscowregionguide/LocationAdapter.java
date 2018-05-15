package com.example.yulia.moscowregionguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.ViewHolder> {

    Context context;
    private List<Location> locations;


    LocationAdapter(List<Location> locations, Context mContext){
        this.locations = locations;
        this.context = mContext;
    }

    public LocationAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_of_place, parent, false);
        return new ViewHolder(v);
    }

    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, final int position) {
        viewHolder.placeImageView.setImageResource(locations.get(position).getlPhoto());

        viewHolder.nameTextView.setText(locations.get(position).getlName());

        viewHolder.infoTextView.setText(locations.get(position).getlInfo());

        viewHolder.mapImageView.setBackgroundResource(R.drawable.geo_im);
//        viewHolder.mapImageView.getBackground().setAlpha(150);








    }

    public int getItemCount() {
        return locations.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {


        ImageView placeImageView, mapImageView;
        TextView nameTextView, infoTextView;
        Button linkButtonView;

        ViewHolder(View itemView) {
            super(itemView);
            placeImageView = itemView.findViewById(R.id.place_image_view);
            nameTextView = itemView.findViewById(R.id.name_place);
            infoTextView = itemView.findViewById(R.id.info_text);
            mapImageView = itemView.findViewById(R.id.geo_image);
            linkButtonView = itemView.findViewById(R.id.link_button);

        }
    }

}
