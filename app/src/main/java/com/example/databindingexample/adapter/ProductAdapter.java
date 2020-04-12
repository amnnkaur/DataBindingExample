package com.example.databindingexample.adapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.databindingexample.R;
import com.example.databindingexample.databinding.ItemProductBinding;
import com.example.databindingexample.model.Product;
import com.example.databindingexample.model.ProductsList;
import com.example.databindingexample.ui.MainActivity;

import java.io.Serializable;
import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private ProductsList productArrayList;

    public ProductAdapter(ProductsList productArrayList) {
        this.productArrayList = productArrayList;
    }


    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ItemProductBinding itemProductBinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()), R.layout.item_product,parent,false);

        ProductViewHolder productViewHolder = new ProductViewHolder(itemProductBinding);
        return productViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ProductViewHolder holder, final int position) {

        Product product = productArrayList.PRODUCT_MAP.get(position);
        holder.itemProductBinding.setProduct(product);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Product pos = productArrayList.PRODUCT_MAP.get(position);
                Bundle myBundle = new Bundle();
                myBundle.putSerializable("productDetail", (Serializable) pos);

                Intent mIntent = new Intent(holder.itemView.getContext(), MainActivity.class);
                mIntent.putExtra("object", myBundle);
                holder.itemView.getContext().startActivity(mIntent);
            }
        });

    }


    @Override
    public int getItemCount() {
        return this.productArrayList.PRODUCT_MAP.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {

        ItemProductBinding itemProductBinding;

        public ProductViewHolder(@NonNull ItemProductBinding itemView) {
            super(itemView.getRoot());

            this.itemProductBinding = itemView;
        }
    }
}

//aman