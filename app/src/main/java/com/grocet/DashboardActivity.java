package com.grocet;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.grocet.adapter.GridAdapter;
import com.grocet.model.GridModel;

import java.util.ArrayList;


public class DashboardActivity extends AppCompatActivity {
    String name;
    GridView gridView;
    FloatingActionButton floatingActionButton;
    String[] strData = {"Vegetables", "Fruits", "Dairy", "Bread & Bakery", "Beverages", "Spices", "Canned Goods", "Your Cart"};
    int[] imgData = {R.drawable.vegetables, R.drawable.fruits, R.drawable.dairy, R.drawable.bread, R.drawable.beverages, R.drawable.spices, R.drawable.cannedgoods, R.drawable.cart};

    ArrayList<GridModel> gridModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dashboard);
        floatingActionButton = findViewById(R.id.btn_logout);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
        gridView = findViewById(R.id.grid_view);
        gridModelArrayList = new ArrayList<GridModel>();

        for (int i = 0; i < strData.length; i++) {
            GridModel langModel = new GridModel(strData[i], imgData[i]);
            gridModelArrayList.add(langModel);
        }

        GridAdapter myGridAdapter = new GridAdapter(this, gridModelArrayList);
        gridView.setAdapter(myGridAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent intent = new Intent(DashboardActivity.this, VegetablesActivity.class);
                    startActivity(intent);
                } else if (i == 1) {
                    Intent intent = new Intent(DashboardActivity.this, FruitsActivity.class);
                    startActivity(intent);
                } else if (i == 2) {
                    Intent intent = new Intent(DashboardActivity.this, DairyActivity.class);
                    startActivity(intent);
                } else if (i == 3) {
                    Intent intent = new Intent(DashboardActivity.this, LogoutActivity.class);
                    startActivity(intent);

                } else if (i == 4) {
                    Intent intent = new Intent(DashboardActivity.this, SignupActivity.class);
                    startActivity(intent);
                } else if (i == 5) {
                    Intent intent = new Intent(DashboardActivity.this, SignupActivity.class);
                    startActivity(intent);
                } else if (i == 6) {
                    Intent intent = new Intent(DashboardActivity.this, SignupActivity.class);
                    startActivity(intent);
                } else if (i == 7) {
                    Intent intent = new Intent(DashboardActivity.this, SignupActivity.class);
                    startActivity(intent);
                } else if (i == 8) {
                    Intent intent = new Intent(DashboardActivity.this, SignupActivity.class);
                    startActivity(intent);
                }
            }


        });
    }

}
