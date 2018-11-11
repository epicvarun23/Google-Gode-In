package com.example.android.justjava;

import android.annotation.SuppressLint;
import android.os.ResultReceiver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public  int FinalCost;
    public int quantity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void add(View view){
        quantity++;
        displayCost(quantity);
        }

    public void sub(View view){
        quantity--;
        displayCost(quantity);
    }

    private void displayCost(int i){
        TextView numberOfCoffees = (TextView)findViewById(R.id.Quantity);
        numberOfCoffees.setText("" + i);
    }
    public void Thanks(View view){
        TextView thanks = (TextView)findViewById(R.id.FinalText);
        EditText Name = (EditText)findViewById(R.id.Name);
        String Result = Name.getText().toString();
        thanks.setText("Thank you " + Result + " For Ordering " + quantity + " Coffees, Your Total is  $" + 2*quantity);
    }
}
