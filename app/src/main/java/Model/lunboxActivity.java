package com.nguyenducthang.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.nguyenducthang.test.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        addEvents();
    }

    private void addEvents(){
        binding.imvBtnLunchbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iLunch = new Intent(MainActivity.this, lunboxActivity.class);
                startActivity(iLunch);
            }
        });
    }
}