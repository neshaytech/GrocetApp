package com.grocet.model;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.grocet.R;

public class VegetableViewHolder extends RecyclerView.ViewHolder {

    TextView vegetableName, vegetablePrice, vegetableQuantity;
    ImageView vegetableImage;

    // Constructor that accepts the itemView and finds views by their ID
    public VegetableViewHolder(@NonNull View itemView) {
        super(itemView);

        // Initialize the TextViews and ImageView from the layout
        vegetableName = itemView.findViewById(R.id.vegetable_name);
        vegetablePrice = itemView.findViewById(R.id.vegetable_price);
        vegetableQuantity = itemView.findViewById(R.id.vegetable_quantity);
        vegetableImage = itemView.findViewById(R.id.vegetable_image);
    }
}
