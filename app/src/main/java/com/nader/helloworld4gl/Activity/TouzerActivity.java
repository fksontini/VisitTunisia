package com.nader.helloworld4gl.Activity;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.nader.helloworld4gl.R;

import static com.nader.helloworld4gl.R.drawable.hotel_selected;

public class TouzerActivity extends AppCompatActivity {


ImageView imgHotel,imgRestaurant,imgMonument;
TextView txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_touzer);
         imgHotel = findViewById(R.id.imgHotel);
         imgRestaurant = findViewById(R.id.imgRestaurant);
         imgMonument = findViewById(R.id.imgMonument);
         txtView=findViewById(R.id.txtView);
    }

    @Override
    protected void onResume() {
        super.onResume();
        imgHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgHotel.setBackground(getResources().getDrawable(R.drawable.hotel_selected));
                imgRestaurant.setBackground(getResources().getDrawable(R.drawable.restaurant));
                imgMonument.setBackground(getResources().getDrawable(R.drawable.monument));
txtView.setText("Hotel");
            }
        });
        imgMonument.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgMonument.setBackground(getResources().getDrawable(R.drawable.monument_selected));
                imgHotel.setBackground(getResources().getDrawable(R.drawable.hotel));
                imgRestaurant.setBackground(getResources().getDrawable(R.drawable.restaurant));
                txtView.setText("Monument");
            }
        });
        imgRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgRestaurant.setBackground(getResources().getDrawable(R.drawable.restaurant_selected));
                imgMonument.setBackground(getResources().getDrawable(R.drawable.monument));
                imgHotel.setBackground(getResources().getDrawable(R.drawable.hotel));
                txtView.setText("Restaurant");
            }
        });
    }
}
