package com.example.neeleshtripathi.registration_form;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;

import android.view.View;

import android.widget.Button;

import android.widget.TextView;

public class full_name extends AppCompatActivity {
    TextView name,mail,phone,state,city;

    Button back;

    Integer stringPo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_name);
        name=findViewById(R.id.name);

        mail=findViewById(R.id.maill);

        phone=findViewById(R.id.phone);

        state=findViewById(R.id.state);

        city=findViewById(R.id.city);

        back=findViewById(R.id.submit);

        stringPo=Integer.parseInt(getIntent().getStringExtra("state_po"));
        Log.d("TEST",stringPo+"");
        name.setText(getIntent().getStringExtra("name"));
        mail.setText(getIntent().getStringExtra("mail"));
        phone.setText(getIntent().getStringExtra("phone"));
        state.setText(getIntent().getStringExtra("state"));
        city.setText(getIntent().getStringExtra("city"));



        back.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Intent intent = new Intent(full_name.this,MainActivity.class);

                intent.putExtra("name2",name.getText().toString());

                intent.putExtra("mail2",mail.getText().toString());

                intent.putExtra("phone2",phone.getText().toString());

                intent.putExtra("city2",city.getText().toString());

                intent.putExtra("string_po",stringPo);

                startActivity(intent);

            }

        });


    }
}
