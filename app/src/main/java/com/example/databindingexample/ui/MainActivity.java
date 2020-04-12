package com.example.databindingexample.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.example.databindingexample.R;
import com.example.databindingexample.databinding.ActivityMainBinding;
import com.example.databindingexample.model.Product;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mBinding;

    Bundle fetch;

    Product object;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        Intent myIntent = getIntent();
        fetch = myIntent.getBundleExtra("object");
        object = (Product) fetch.getSerializable("productDetail");

        mBinding.setProduct(object);
    }
}
