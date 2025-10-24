package com.example.pokuspizza;

import android.content.Intent;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button cheeseInfo, pepInfo;
    EditText search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cheeseInfo = (Button) findViewById(R.id.cheesePizzainfo);
        pepInfo = (Button) findViewById(R.id.pepperoniPizzainfo);
        search = (EditText) findViewById(R.id.search);


        cheeseInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cheese = new Intent(MainActivity.this, CheeseActivity.class);
                startActivity(cheese);
            }
        });
        pepInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pepperoni = new Intent(MainActivity.this, PepperoniActivity.class);
                startActivity(pepperoni);
            }
        });

    }
}