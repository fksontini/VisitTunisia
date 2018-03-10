package com.fksontini.HelloWorld4GL;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.fksontini.HelloWorld4GL.MenuActivity;
import com.fksontini.HelloWorld4GL.R;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rlSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rlSplash = (RelativeLayout) findViewById(R.id.rlSplash);

    }

    @Override
    protected void onResume() {
        super.onResume();

      new Handler().postDelayed(new Runnable() {
          @Override
          public void run() {
              Intent i = new Intent(MainActivity.this,MenuActivity.class);
              startActivity(i);
          }
      },2000);



    }
}
