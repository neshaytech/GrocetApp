package com.grocet;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.grocet.model.VegetableLangModel;

import java.util.ArrayList;

public class CartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cart);
        ArrayList<VegetableLangModel> cartList = (ArrayList<VegetableLangModel>) getIntent().getSerializableExtra("cartList");

    }
}