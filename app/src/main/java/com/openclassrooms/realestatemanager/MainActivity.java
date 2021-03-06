package com.openclassrooms.realestatemanager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textViewMain;
    private TextView textViewQuantity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_add_real_estate);
        //setContentView(R.layout.activity_main);

        //BUG FIXED : The TextView id wasn't right
        //this.textViewMain = findViewById(R.id.activity_second_activity_text_view_main);

        this.textViewMain = findViewById(R.id.activity_main_activity_text_view_main);
        this.textViewQuantity = findViewById(R.id.activity_main_activity_text_view_quantity);

        //this.configureTextViewMain();
        //this.configureTextViewQuantity();
    }

    private void configureTextViewMain() {
        this.textViewMain.setTextSize(15);
        this.textViewMain.setText(R.string.main_activity_text_view_1);
    }

    @SuppressLint("SetTextI18n")
    private void configureTextViewQuantity() {
        int quantity = Utils.convertDollarToEuro(100);
        this.textViewQuantity.setTextSize(20);
        //BUG FIXED : The quantity is converted into a string, w/ Integer.toString(), to screen's display.
        //setText(int) is also used to get string resource by id, & in Android all resource id has an int value.
        this.textViewQuantity.setText(Integer.toString(quantity));
    }
}
