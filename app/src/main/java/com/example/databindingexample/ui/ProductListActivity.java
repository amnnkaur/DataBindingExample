package com.example.databindingexample.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Adapter;

import com.example.databindingexample.R;
import com.example.databindingexample.adapter.ProductAdapter;
import com.example.databindingexample.databinding.ActivityProductListBinding;
import com.example.databindingexample.model.Product;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.databindingexample.model.ProductsList;

import java.util.ArrayList;

public class ProductListActivity extends AppCompatActivity {

    ActivityProductListBinding pBinding;
    private ProductAdapter productAdapter;

    ProductsList productsList = new ProductsList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pBinding = DataBindingUtil.setContentView(this, R.layout.activity_product_list);
        pBinding.rvProducts.setLayoutManager(new LinearLayoutManager(this));

        productAdapter = new ProductAdapter(productsList);
        pBinding.rvProducts.setAdapter(productAdapter);

    }

}
