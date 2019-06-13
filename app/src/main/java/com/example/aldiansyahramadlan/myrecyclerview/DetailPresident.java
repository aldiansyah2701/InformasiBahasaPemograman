package com.example.aldiansyahramadlan.myrecyclerview;

import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailPresident extends AppCompatActivity {

    TextView tvDateReceivedName,tvDateReceivedRemarks, tvDateReceivedDescription, tvDateReceivedFounder, tvDateReceivedYear;
    ImageView imgPhoto;
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_REMARKS = "extra_remarks";
    public static final String EXTRA_PHOTO = "extra_photo";
    public static final String EXTRA_DESCRIPTION = "extra_deskripsi";
    public static final String EXTRA_FOUNDER = "extra_penemu";
    public static final String EXTRA_YEARS = "extra_tahun";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_detail_president);

        tvDateReceivedName =findViewById(R.id.tv_item_name);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        tvDateReceivedName.setText(name);

        tvDateReceivedRemarks = findViewById(R.id.tv_item_remarks);
        String remarks = getIntent().getStringExtra(EXTRA_REMARKS);
        tvDateReceivedRemarks.setText(remarks);

        imgPhoto = findViewById(R.id.img_item_photo);
        String photo = getIntent().getStringExtra(EXTRA_PHOTO);
        Glide.with(this).load(photo).apply(new RequestOptions().override(450, 650))
                .into(imgPhoto);

        tvDateReceivedDescription = findViewById(R.id.tv_item_description);
        String description = getIntent().getStringExtra(EXTRA_DESCRIPTION);
        tvDateReceivedDescription.setText(description);

        tvDateReceivedFounder = findViewById(R.id.tv_item_penemu);
        String founder = getIntent().getStringExtra(EXTRA_FOUNDER);
        tvDateReceivedFounder.setText(founder);

        tvDateReceivedYear = findViewById(R.id.tv_item_tahun);
        String year = getIntent().getStringExtra(EXTRA_YEARS);
        tvDateReceivedYear.setText(year);

    }

}
