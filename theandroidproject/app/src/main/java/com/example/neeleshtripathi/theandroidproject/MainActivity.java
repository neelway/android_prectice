package com.example.neeleshtripathi.theandroidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast t = Toast.makeText(getApplicationContext(),"hello world",Toast.LENGTH_SHORT);
        t.setGravity(Gravity.TOP,0,0);
        t.setDuration(Toast.LENGTH_LONG);
        t.show();
    }
}
