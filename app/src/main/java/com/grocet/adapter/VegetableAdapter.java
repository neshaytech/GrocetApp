package com.grocet.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

import com.grocet.R;
import com.grocet.model.VegetableLangModel;

import java.util.ArrayList;

public class VegetableAdapter extends ArrayAdapter<VegetableLangModel> {

    private ArrayList<VegetableLangModel> vegetableList;
    private ArrayList<VegetableLangModel> cartList = new ArrayList<>();
    private Context context;

    public VegetableAdapter(@NonNull Context context, ArrayList<VegetableLangModel> vegetableList) {
        super(context, 0, vegetableList);
        this.context = context;
        this.vegetableList = vegetableList;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.vegetables_item, parent, false);
        }

        VegetableLangModel vegetable = getItem(position);

        // Bind data to views
        TextView vegName = convertView.findViewById(R.id.vegetable_name);
        TextView vegPrice = convertView.findViewById(R.id.vegetable_price);
        TextView vegQty = convertView.findViewById(R.id.vegetable_quantity);
        ImageView vegImage = convertView.findViewById(R.id.vegetable_image);
        Button addButton = convertView.findViewById(R.id.add_button);

        vegName.setText(vegetable.getName());
        vegPrice.setText(String.format("Price: $%.2f", vegetable.getPrice()));
        vegQty.setText("Quantity: " + vegetable.getQuantity());
        vegImage.setImageDrawable(ContextCompat.getDrawable(context, vegetable.getImage()));

        // Handle add to cart button click
        addButton.setOnClickListener(v -> {
            if (!cartList.contains(vegetable)) {
                cartList.add(vegetable);
                Toast.makeText(context, vegetable.getName() + " added to cart!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(context, vegetable.getName() + " is already in the cart", Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }

    // Method to return cart list
    public ArrayList<VegetableLangModel> getCartList() {
        return cartList;
    }
}
