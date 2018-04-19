package com.example.neeleshtripathi.registration_form;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,mail,phone;
    Button submit;
    Spinner state,city;
    String statestr,citystr;
    Integer state_po;
    Integer city_po;
    String states[] = { "Uttar Pradesh","Delhi","uttarakhand"};
    String upcity[]={"sultanpur","banaras","Noida"};
    String dlcity[]={"delhi","new delhi"};
    String ukcity[]={"haridwar","dehradhun"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.tvname);
        mail = findViewById(R.id.tvmail);
        phone = findViewById(R.id.tvphone);
        city = findViewById(R.id.spcity);
        state = findViewById(R.id.spstate);
        submit = findViewById(R.id.btnsubmit);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.state,R.id.tvstate, states);
        state.setAdapter(arrayAdapter);
        state.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                statestr = states[i];
                state_po=i;
                if(i==0)
                {
                    ArrayAdapter<String> cityview= new ArrayAdapter<String>(getApplicationContext(),R.layout.state,R.id.tvstate,upcity);
                    city.setAdapter(cityview);
                }
                if(i==1)
                {
                    ArrayAdapter<String> cityview= new ArrayAdapter<String>(getApplicationContext(),R.layout.state,R.id.tvstate,dlcity);
                    city.setAdapter(cityview);
                }
                if(i==2)
                {
                    ArrayAdapter<String> cityview= new ArrayAdapter<String>(getApplicationContext(),R.layout.state,R.id.tvstate,ukcity);
                    city.setAdapter(cityview);

                }

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        city.setOnItemSelectedListener((new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
               if(statestr.equals("Uttar Pradesh"))
               {
                   citystr=upcity[i];
               }
               if(statestr.equals("Delhi"))
                {
                    citystr=dlcity[i];
                }
                 if (statestr.equals("uttarakhand"))
                 {
                     citystr=ukcity[i];
                 }
                city_po = i;
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        }));
        submit.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, full_name.class);
                intent.putExtra("name", name.getText().toString());
                intent.putExtra("mail", mail.getText().toString());
                intent.putExtra("phone", phone.getText().toString());
                intent.putExtra("state", statestr);
                intent.putExtra("state_po", state_po.toString());
                intent.putExtra("city", citystr);
                intent.putExtra("city_po",city_po.toString());
                startActivity(intent);
            }
        });
        name.setText(getIntent().getStringExtra("name2"));
        mail.setText(getIntent().getStringExtra("mail2"));
        phone.setText(getIntent().getStringExtra("phone2"));
        city_po=getIntent().getIntExtra("city_po",0);
        city.setSelection(city_po);
        state_po=getIntent().getIntExtra("string_po",0);
        state.setSelection(state_po);
    }
}
