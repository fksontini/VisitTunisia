package com.fksontini.HelloWorld4GL;


import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;



import static com.fksontini.HelloWorld4GL.R.drawable.hotel_selected;

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
      //  container=(FrameLayout)findViewById(R.id.container);
    }

    @Override
    protected void onResume() {
        super.onResume();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment,new HotelFragment()).commit();
        imgHotel.setBackground(getResources().getDrawable(R.drawable.hotel_selected));
        imgHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgHotel.setBackground(getResources().getDrawable(R.drawable.hotel_selected));
                imgRestaurant.setBackground(getResources().getDrawable(R.drawable.restaurant));
                imgMonument.setBackground(getResources().getDrawable(R.drawable.monument));
                //txtView.setText("Hotel");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new HotelFragment()).commit();

            }
        });
        imgMonument.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgMonument.setBackground(getResources().getDrawable(R.drawable.monument_selected));
                imgHotel.setBackground(getResources().getDrawable(R.drawable.hotel));
                imgRestaurant.setBackground(getResources().getDrawable(R.drawable.restaurant));
               // txtView.setText("Monument");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new MonumentFragment()).commit();
            }
        });
        imgRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgRestaurant.setBackground(getResources().getDrawable(R.drawable.restaurant_selected));
                imgMonument.setBackground(getResources().getDrawable(R.drawable.monument));
                imgHotel.setBackground(getResources().getDrawable(R.drawable.hotel));
              //  txtView.setText("Restaurant");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new RestaurantFragment()).commit();

            }
        });
    }
}
