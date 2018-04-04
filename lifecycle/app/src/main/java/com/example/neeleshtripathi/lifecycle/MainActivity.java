package com.example.neeleshtripathi.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast t = Toast.makeText(getApplicationContext(),"Create",Toast.LENGTH_SHORT);
        t.setGravity(Gravity.TOP,0,0);
        t.setDuration(Toast.LENGTH_LONG);
        t.show();


    }
    @Override
    protected  void  onStart()
    {
        super.onStart();
        Toast t = Toast.makeText(getApplicationContext(),"start",Toast.LENGTH_SHORT);
        t.setGravity(Gravity.TOP,0,0);
        t.setDuration(Toast.LENGTH_LONG);
        t.show();

    }
    @Override
    protected  void onResume()
    {
        super.onResume();
        Toast t = Toast.makeText(getApplicationContext(),"Resume",Toast.LENGTH_SHORT);
        t.setGravity(Gravity.TOP,0,0);
        t.setDuration(Toast.LENGTH_LONG);
        t.show();
    }
    @Override
    protected  void onRestart()
    {
        super.onRestart();
        Toast t = Toast.makeText(getApplicationContext(),"Resume",Toast.LENGTH_SHORT);
        t.setGravity(Gravity.TOP,0,0);
        t.setDuration(Toast.LENGTH_LONG);
        t.show();
    }
    @Override
    protected  void onPause()
    {
        super.onPause();
        Toast t = Toast.makeText(getApplicationContext(),"Pause",Toast.LENGTH_SHORT);
        t.setGravity(Gravity.TOP,0,0);
        t.setDuration(Toast.LENGTH_LONG);
        t.show();
    }
    @Override
    protected  void onStop()
    {
        super.onStop();
        Toast t = Toast.makeText(getApplicationContext(),"Stop",Toast.LENGTH_SHORT);
        t.setGravity(Gravity.TOP,0,0);
        t.setDuration(Toast.LENGTH_LONG);
        t.show();
    }
    @Override
    protected  void onDestroy()
    {
        super.onDestroy();
        Toast t = Toast.makeText(getApplicationContext(),"Destroy",Toast.LENGTH_SHORT);
        t.setGravity(Gravity.TOP,0,0);
        t.setDuration(Toast.LENGTH_LONG);
        t.show();
    }




}
