package com.example.ex5;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

import static com.example.ex5.R.*;

public class MainActivity extends AppCompatActivity {
    Random rand = new Random();
    int ran;
    ImageButton imageButton;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageView= (ImageView) findViewById(R.id.imageView);
    }


    public void click(View view) {
        ran =  1+rand.nextInt(3);
        if(ran==1) {
            imageView.setImageResource(R.drawable.ilan1);
            imageButton.setImageResource(R.drawable.one1);
        }
        else if(ran==2) {
            imageView.setImageResource(R.drawable.oded1);
            imageButton.setImageResource(drawable.two1);
        }
        else{
            imageView.setImageResource(R.drawable.kobi1);
            imageButton.setImageResource(drawable.three1);
        }

    }
}