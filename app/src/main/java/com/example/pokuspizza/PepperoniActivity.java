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
                Add.setText(getStirng(R.string.addCart) + "+" + total +"(" + total-10 + ")";

            }
        });    
        ExtraCheese.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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
                Add.setText(getStirng(R.string.addCart) + "+" + total +"(" + total-10 + ")";
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
                Add.setText(getStirng(R.string.addCart) + "+" + total +"(" + total-10 + ")";
              
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
                Add.setText(getStirng(R.string.addCart) + "+" + total +"(" + total-10 + ")");

            }
        });    
        
        Add.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        Intent cart = new Intent(PepperoniActivity.this, CartActivity.class);

            cart.putExtra("ITEM_NAME","pepperoni Pizza")
            cart.putExtra("PEPPERONI_IMG",R.drawable.pep);
            cart.putExtra("COST",total);
            Toast.makeText(this, "Added To Cart", Toast.LENGTH_SHORT).show();
            startActivity(cart);
            }
            });

        


        /*new CountDownTimer(1001, 1000)
            {
                public void onTick(long millisUntilFinished) {toast.show();}
                public void onFinish() {toast.cancel();}
            }.start(); */
    
    }

}
