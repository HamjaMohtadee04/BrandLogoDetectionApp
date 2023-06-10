package com.example.brandlogodetectionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    CardView showReview, goUserProfileActivity, goRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        showReview = findViewById(R.id.idReview);
        goUserProfileActivity = findViewById(R.id.goUserProfileId);
        goRating = findViewById(R.id.ratingId);

        goRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iii = new Intent(HomeActivity.this,Rating.class);
                startActivity(iii);
            }
        });
        goUserProfileActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(HomeActivity.this,UserProfileActivity.class);
                startActivity(ii);
            }
        });


        showReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this,ShowImageReview.class);
                startActivity(i);
            }
        });
    }
}