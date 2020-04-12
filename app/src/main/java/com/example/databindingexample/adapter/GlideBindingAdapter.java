package com.example.databindingexample.adapter;

import android.app.DownloadManager;
import android.content.Context;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.databindingexample.R;

public class GlideBindingAdapter {

    @BindingAdapter("imageURL")
    public static void setImageResource(ImageView view, int imageURL){

        Context context = view.getContext();

        RequestOptions options = new RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background);

        Glide.with(context)
                .setDefaultRequestOptions(options)
                .load(imageURL)
                .into(view);

    }
}
