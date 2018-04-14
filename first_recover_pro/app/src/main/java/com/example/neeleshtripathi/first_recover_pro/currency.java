package com.example.neeleshtripathi.first_recover_pro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class currency extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        Button doller =findViewById(R.id.doller);
        Button ruppes=findViewById(R.id.rupee);
        Button clear=findViewById(R.id.clear);
        final EditText rupees = findViewById(R.id.rupees);
        final EditText dolers = findViewById(R.id.dolers);

        doller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rup = rupees.getText().toString();

                if (!rup.equals("")) {
                    Double d = Double.parseDouble(rup);
//                    String doler = formatDouble(Math.round(d / 64));
                    String doller = formatDouble(d / 64);
                    dolers.setText(String.valueOf(doller));
                }
            }
        });
        ruppes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dol = dolers.getText().toString();
              if (!dol.equals("")) {
                   Double de = Double.parseDouble(dol);
////                    String Rupee = formatDouble(Math.round(de * 64));
                    String Rupee = formatDouble(de * 64);
                  rupees.setText(Rupee);
               }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rupees.setText("");
                dolers.setText("");
            }
        });

    }

    public String formatDouble(double d) {
        if (d % 1 == 0) {
            int i = (int) d;
            return Integer.toString(i);
        } else {
            DecimalFormat df = new DecimalFormat("####.00");
            return df.format(d);
        }
    }
}
