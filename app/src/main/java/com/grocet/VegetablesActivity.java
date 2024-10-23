package com.grocet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.grocet.adapter.VegetableAdapter;
import com.grocet.model.VegetableLangModel;

import java.util.ArrayList;

public class VegetablesActivity extends AppCompatActivity {


    private ListView listView;
    private ArrayList<VegetableLangModel> vegetableList;
    private VegetableAdapter adapter;
    private Button viewCartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetables);

        // Initialize views
        listView = findViewById(R.id.vegetable_list_view);
        viewCartButton = findViewById(R.id.checkout_button);

        // Initialize vegetable list
        vegetableList = new ArrayList<>();

        // Add vegetable items (sample data)
        vegetableList.add(new VegetableLangModel("Tomato", 1.00, 5, R.drawable.tomato));
        vegetableList.add(new VegetableLangModel("Carrot", 1.00, 5, R.drawable.grapes));
        vegetableList.add(new VegetableLangModel("Potato", 1.00, 5, R.drawable.brinjal));
        // Add more vegetables as needed

        // Initialize the adapter
        adapter = new VegetableAdapter(this, vegetableList);
        listView.setAdapter(adapter);

        // Button to navigate to CartActivity
        viewCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to navigate to CartActivity
                Intent intent = new Intent(VegetablesActivity.this, CartActivity.class);

                // Pass the cart list (Serializable)
                intent.putExtra("cartList", adapter.getCartList());  // Assuming getCartList() returns ArrayList<VegetableLangModel>

                // Start CartActivity
                startActivity(intent);
            }
        });
    }
}
