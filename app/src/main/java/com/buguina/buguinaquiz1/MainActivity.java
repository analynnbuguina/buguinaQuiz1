package com.buguina.buguinaquiz1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.buguina.buguinaquiz1.R.layout.activity_second;

public class MainActivity extends AppCompatActivity {


    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ComSci(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void InfoTech(View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }


    public void InfoSys(View view) {
        Intent intent = new Intent(this, FourthActivity.class);
        startActivity(intent);
    }
}


