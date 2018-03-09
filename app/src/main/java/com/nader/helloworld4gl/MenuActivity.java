package com.nader.helloworld4gl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MenuActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    @Override
    protected void onResume() {

        super.onResume();
        RelativeLayout gabes= (RelativeLayout)findViewById(R.id.gafsa);
        gabes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MenuActivity.this,TouzerActivity.class);
                startActivity(i);
            }
        });
        RelativeLayout kebili= (RelativeLayout)findViewById(R.id.kebili);
        kebili.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MenuActivity.this,TouzerActivity.class);
                startActivity(i);
            }
        });
        RelativeLayout touzer= (RelativeLayout)findViewById(R.id.Tozeur);
        touzer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MenuActivity.this,TouzerActivity.class);
                startActivity(i);
            }
        });
        RelativeLayout djerba= (RelativeLayout)findViewById(R.id.Djerba);
        djerba.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i= new Intent(MenuActivity.this,TouzerActivity.class);
            startActivity(i);
        }
    });
    }
}
