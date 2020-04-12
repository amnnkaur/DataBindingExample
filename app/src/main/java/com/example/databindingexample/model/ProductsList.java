package com.example.databindingexample.model;

import com.example.databindingexample.R;

import java.util.ArrayList;
import java.util.HashMap;

public class ProductsList {

    public Product[] PRODUCTS = {RED_LAMP, YELLOW_LAMP, BLUE_MUG, BLACK_HAT, ORANGE_HAT, BLACK_SHIRT_MALE, GREY_FIDGET_SPINNER};


    public HashMap<String, Product> PRODUCT_MAP = new HashMap<>();

    public ProductsList() {
        for (Product product : PRODUCTS) {
            PRODUCT_MAP.put(String.valueOf(product.getId()), product);
        }

    }

    public static final Product RED_LAMP = new Product(1,"Red Lamp", "Red colored lamp, perfect for lighting up a room and matching any red furniture.", R.drawable.red_lamp, 10.99, 4.5F);

    public static final Product YELLOW_LAMP = new Product(2,"Yellow Lamp", "Yellow colored lamp, perfect for lighting up a room and matching any Yellow furniture.", R.drawable.yellow_lamp, 11.99, 5.0F);

    public static final Product BLUE_MUG = new Product(3,"Blue Coffee Mug", "Blue Coffee Mug for drinking coffee. 100% ceramic.",
            R.drawable.blue_mug, 5.99, 3.5F);

    public static final Product BLACK_HAT = new Product(4,"Black Baseball Hat", "Black Baseball Hat made of 100% authentic baseball hat material.",
            R.drawable.black_hat, 20.99, 3.5F);

    public static final Product ORANGE_HAT = new Product(5,"Orange Baseball Hat", "Orange Baseball Hat made of 100% authentic baseball hat material.",
            R.drawable.orange_hat,23.99,4.0F);

    public static final Product BLACK_SHIRT_MALE = new Product(6,"Black Shirt", "Black T-Shirt made of 100% cotton. Made for males.", R.drawable.black_shirt_male, 26.99, 5.0F);

    public static final Product GREY_FIDGET_SPINNER = new Product(7,"Grey Fidget Spinner", "Grey Fidget Spinner. High quality bearing for long spin time. Light and portable.", R.drawable.fidget_spinner_grey, 10.00,4.5F );

}