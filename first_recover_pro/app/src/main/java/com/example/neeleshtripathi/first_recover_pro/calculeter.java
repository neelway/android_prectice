package com.example.neeleshtripathi.first_recover_pro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class calculeter extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, badd, bsub, bmul, bdiv, bdot, bequal,clear;
    TextView ans;
    Double var1, var2;
    Boolean add=false, mul=false, div=false, sub=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculeter);

        b1 = findViewById(R.id.one);
        b2 = findViewById(R.id.Two);
        b3 = findViewById(R.id.Three);
        b4 = findViewById(R.id.four);
        b5 = findViewById(R.id.Five);
        b6 = findViewById(R.id.Six);
        b7 = findViewById(R.id.Seven);
        b8 = findViewById(R.id.Eight);
        b9 = findViewById(R.id.Nine);
        b0 = findViewById(R.id.Zero);
        badd = findViewById(R.id.plus);
        bsub = findViewById(R.id.Mines);
        bdiv = findViewById(R.id.divid);
        bmul = findViewById(R.id.multiple);
        bdot = findViewById(R.id.Point);
        ans = findViewById(R.id.Result);
        bequal = findViewById(R.id.Equal);
        clear=findViewById(R.id.clear);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "1");

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "4");

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + ".");
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1 = Double.parseDouble(ans.getText() + "");
                add = true;
                ans.setText(null);

            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1 = Double.parseDouble(ans.getText() + "");
                sub = true;
                ans.setText(null);

            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1 = Double.parseDouble(ans.getText() + "");
                div = true;
                ans.setText(null);

            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1 = Double.parseDouble(ans.getText() + "");
                mul = true;
                ans.setText("");
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var2 = Double.parseDouble(ans.getText() + "");

                if (add == true) {
                    ans.setText(var1 + var2 + "");
                    add = false;
                }

                if(sub==true)
                {
                    ans.setText(var1-var2 +"");
                    sub=false;
                }
                if(mul==true)
                {
                    ans.setText(var1*var2 +"");
                    mul=false;
                }
                if (div == true) {
                    ans.setText(var1 / var2 + "");
                    div = false;
                }


            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(" ");
            }
        });

    }


}


