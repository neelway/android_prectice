package com.example.neeleshtripathi.intentwithimage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Date;

public class Insttructor_screen extends AppCompatActivity {
    Button googleBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insttructor_screen);
        Toast.makeText(this, "welcome Instructor", Toast.LENGTH_SHORT).show();

        googleBtn = findViewById(R.id.google);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.co.in/"));

                startActivity(i);
            }
        });
    }
}

