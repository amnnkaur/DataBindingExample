package com.example.databindingexample.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.databindingexample.R;
import com.example.databindingexample.adapter.ProductAdapter;
import com.example.databindingexample.databinding.ActivityProductListBinding;
import com.example.databindingexample.model.Product;

import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;


public class ProductListActivity extends AppCompatActivity {

    ActivityProductListBinding pBinding;
    private ProductAdapter productAdapter;
    private Product mProduct;
    private ArrayList<Product> productArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pBinding = DataBindingUtil.setContentView(this, R.layout.activity_product_list);
        pBinding.rvProducts.setLayoutManager(new LinearLayoutManager(this));

        populateProducts();


        productAdapter = new ProductAdapter(productArrayList);
        pBinding.rvProducts.setAdapter(productAdapter);

    }
    public void populateProducts(){

        productArrayList.add(new Product(1,"Red Lamp", "Red colored lamp, perfect for lighting up a room and matching any red furniture.", R.drawable.red_lamp, 10.99, 4.5F));

        productArrayList.add(new Product(2,"Yellow Lamp", "Yellow colored lamp, perfect for lighting up a room and matching any Yellow furniture.", R.drawable.yellow_lamp, 11.99, 5.0F));

        productArrayList.add(new Product(3,"Blue Coffee Mug", "Blue Coffee Mug for drinking coffee. 100% ceramic.",
                R.drawable.blue_mug, 5.99, 3.5F));

        productArrayList.add(new Product(4,"Black Baseball Hat", "Black Baseball Hat made of 100% authentic baseball hat material.",
                R.drawable.black_hat, 20.99, 3.5F));

        productArrayList.add(new Product(5,"Orange Baseball Hat", "Orange Baseball Hat made of 100% authentic baseball hat material.",
                R.drawable.orange_hat,23.99,4.0F));

        productArrayList.add(new Product(6,"Black Shirt", "Black T-Shirt made of 100% cotton. Made for males.", R.drawable.black_shirt_male, 26.99, 5.0F));

        productArrayList.add(new Product(7,"Grey Fidget Spinner", "Grey Fidget Spinner. High quality bearing for long spin time. Light and portable.", R.drawable.fidget_spinner_grey, 10.00,4.5F) );

    }

}
