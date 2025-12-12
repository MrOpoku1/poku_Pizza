package com.example.pokuspizza;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.CheckBox;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.os.CountDownTimer;

public class PepperoniActivity extends AppCompatActivity {

    CheckBox ExtraPepperoni, ExtraCheese, Sausage, Olives;
    Button Add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ExtraPepperoni = (CheckBox)findViewById(R.id.ExtraPepperoni);
        ExtraCheese = (CheckBox)findViewById(R.id.ExtraCheese);
        Sausage = (CheckBox)findViewById(R.id.Sausage);
        Olives = (CheckBox)findViewById(R.id.Olives);
        Add = (Button)findViewById(R.i.Add);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pepperoni);

        double total = 10

        ExtraPepperoni.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    total += 1.50;
                    Toast.makeText(, "Extra pepperoni added!", Toast.LENGTH_SHORT).show();
                } else {
                    // Remove the cost
                    total -= 1.50;
                    Toast.makeText(this, "Extra pepperoni removed", Toast.LENGTH_SHORT).show();
                }

            }
        });    
        ExtraCheese.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            double total=10;
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    total += 1.50;
                    Toast.makeText(, "Extra pepperoni added!", Toast.LENGTH_SHORT).show();
                } else {
                    // Remove the cost
                    total -= 1.50;
                    Toast.makeText(this, "Extra pepperoni removed", Toast.LENGTH_SHORT).show();
                }

            }
        });    
        Sausage.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    total += 1.50;
                    Toast.makeText(, "Extra pepperoni added!", Toast.LENGTH_SHORT).show();
                } else {
                    // Remove the cost
                    total -= 1.50;
                    Toast.makeText(this, "Extra pepperoni removed", Toast.LENGTH_SHORT).show();
                }

            }
        });    
        Olives.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    total += 1.50;
                    Toast.makeText(, "Extra pepperoni added!", Toast.LENGTH_SHORT).show();
                } else {
                    // Remove the cost
                    total -= 1.50;
                    Toast.makeText(this, "Extra pepperoni removed", Toast.LENGTH_SHORT).show();
                }
                Add.setText(

            }
        });    





        /*new CountDownTimer(1001, 1000)
            {
                public void onTick(long millisUntilFinished) {toast.show();}
                public void onFinish() {toast.cancel();}
            }.start(); */
    
    }

}
