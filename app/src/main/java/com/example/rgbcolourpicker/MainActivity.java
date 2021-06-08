package com.example.rgbcolourpicker;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.android.material.slider.Slider;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout container;
    TextView HEX_value_text_view;
    TextView RGB_value_text_view;

    Slider R_value_slider;
    TextView R_value_text_view;

    Slider G_value_slider;
    TextView G_value_text_view;

    Slider B_value_slider;
    TextView B_value_text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewsByID();
        addOnClickListeners();
        addOnChangeListeners();
        setInitialRGBValues();
        updateUI();
    }

    private void updateUI() {
        int R = Math.round(R_value_slider.getValue());
        int G = Math.round(G_value_slider.getValue());
        int B = Math.round(B_value_slider.getValue());
        int RGB = Color.rgb(R,G,B);

        container.setBackgroundColor(RGB);

        HEX_value_text_view.setText(String.format( "#%02x%02x%02x", R, G, B ));
        RGB_value_text_view.setText(new StringBuilder().append("rgb(").append(R).append(",").append(G).append(",").append(B).append(")").toString());
        R_value_text_view.setText(String.valueOf(R));
        G_value_text_view.setText(String.valueOf(G));
        B_value_text_view.setText(String.valueOf(B));
    }

    private void setRGBValue(Slider slider, TextView TextView, int RGBValue) {
        slider.setValue(RGBValue);
        TextView.setText(String.valueOf(RGBValue));
    }

    private void setInitialRGBValues() {
        setRGBValue(R_value_slider, R_value_text_view, 253);
        setRGBValue(G_value_slider, G_value_text_view, 229);
        setRGBValue(B_value_slider, B_value_text_view, 224);
    }

    private void findViewsByID() {
        container = findViewById(R.id.container);
        HEX_value_text_view = findViewById(R.id.HEX_value_text_view);
        RGB_value_text_view = findViewById(R.id.RGB_value_text_view);

        R_value_slider = findViewById(R.id.R_value_slider);
        R_value_text_view = findViewById(R.id.R_value_text_view);

        G_value_slider = findViewById(R.id.G_value_slider);
        G_value_text_view = findViewById(R.id.G_value_text_view);

        B_value_slider = findViewById(R.id.B_value_slider);
        B_value_text_view = findViewById(R.id.B_value_text_view);
    }

    private void addOnClickListeners() {
        View.OnClickListener onColorValueSelected = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v instanceof TextView) {
                    displayToast(((TextView) v).getText() + " has been copied to your clipboard.");
                }
            }
        };

        HEX_value_text_view.setOnClickListener(onColorValueSelected);
        RGB_value_text_view.setOnClickListener(onColorValueSelected);
    }

    private void addOnChangeListeners() {
        R_value_slider.addOnChangeListener((slider, value, fromUser) -> updateUI());
        G_value_slider.addOnChangeListener((slider, value, fromUser) -> updateUI());
        B_value_slider.addOnChangeListener((slider, value, fromUser) -> updateUI());
    }

    private void displayToast(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
    }
}