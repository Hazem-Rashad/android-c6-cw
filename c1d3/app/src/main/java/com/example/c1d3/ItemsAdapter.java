package com.example.c1d3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ItemsAdapter extends ArrayAdapter<Items> {
      List<Items> something;

    public ItemsAdapter(@NonNull Context context, int resource, @NonNull List<Items> objects) {
        super(context, resource, objects);

            something = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.item , parent , false);
       Items thisItem = something.get(position);

        ImageView itemImage = view.findViewById(R.id.imageView);
        TextView itemName =view.findViewById(R.id.itemName);
        TextView itemPrice = view.findViewById(R.id.itemPrice);

        itemImage.setImageResource(thisItem.getItemimage());
        itemName.setText(thisItem.getItemName());
        itemPrice.setText(thisItem.getItemPrice() +"");

        return view ;

    }


}
