package com.example.neeleshtripathi.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Intent i=getIntent();
        String name1= i.getStringExtra("usernmae");
        TextView txt = findViewById(R.id.name);
        txt.append(name1);
    }

}
