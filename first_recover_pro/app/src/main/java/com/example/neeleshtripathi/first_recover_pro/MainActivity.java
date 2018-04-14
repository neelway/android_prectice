package com.example.neeleshtripathi.first_recover_pro;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button google =findViewById(R.id.searchbtn);
        final TextView  currency =findViewById(R.id.currency);
        final TextView googletxt=findViewById(R.id.searchtext);
        TextView calculeter=findViewById(R.id.cal);
        TextView stu =findViewById(R.id.student);
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in/search?q="+googletxt.getText().toString()));
                startActivity(intent);
            }
        });
        currency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,currency.class);
                startActivity(intent);
            }
        });
        calculeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(MainActivity.this,calculeter.class);
                startActivity(intent);
            }
        });
        stu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,studentintent.class);
                startActivity(intent);
            }
        });
    }
}
