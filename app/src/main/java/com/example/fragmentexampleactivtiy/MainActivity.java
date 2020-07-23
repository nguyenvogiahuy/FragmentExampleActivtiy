package com.example.fragmentexampleactivtiy;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements FirstFragment.FirstFragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(int fontsize, String text) {
        SecondFragment textFragment = (SecondFragment)getSupportFragmentManager().findFragmentById(R.id.second_fragment);
        textFragment.changeTextProperties(fontsize, text);
    }
}
