package com.madebyasshad.imageloadwithglide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img=findViewById(R.id.img);
//        img.setImageResource(R.drawable.ic_launcher_background);
        Glide.with(getApplicationContext()).load("https://images.pexels.com/photos/374890/pexels-photo-374890.jpeg?auto=compress&cs=tinysrgb&h=650&w=940").into(img);


    }
}
