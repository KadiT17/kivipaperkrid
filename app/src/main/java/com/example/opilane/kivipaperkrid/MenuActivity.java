package com.example.opilane.kivipaperkrid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void Start(View view) {
        Intent intent = new Intent(MenuActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
