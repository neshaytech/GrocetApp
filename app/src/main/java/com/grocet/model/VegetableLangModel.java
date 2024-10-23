package com.grocet.model;

import android.os.Parcel;
import android.os.Parcelable;

public class VegetableLangModel {

    private String name;
    private double price;
    private int quantity;
    private int image;

    // Constructor
    public VegetableLangModel(String name, double price, int quantity, int image) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.image = image;
    }
    protected VegetableLangModel(Parcel in) {
        name = in.readString();
        price = in.readDouble();
        quantity = in.readInt();
        image = in.readInt();
    }
    public static final Parcelable.Creator<VegetableLangModel> CREATOR = new Parcelable.Creator<VegetableLangModel>() {
        @Override
        public VegetableLangModel createFromParcel(Parcel in) {
            return new VegetableLangModel(in);
        }

        @Override
        public VegetableLangModel[] newArray(int size) {
            return new VegetableLangModel[size];
        }
    };

    // Getter methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getImage() {
        return image;
    }
}
