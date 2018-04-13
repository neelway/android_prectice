package com.example.neeleshtripathi.list_of_country_city;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class city extends AppCompatActivity {
    String India[] = {"delhi","dehradun","ramnagar","mumbai","Indor"};
    String Pakistan[] = {"lahor","Karachi","Faisalabad","Rawalpindi","Gujranwala","Peshawar","Multan","Hyderabad","Islamabad"};
    String Sri_lanka[] = {"kolambo","Moratuwa","Kandy","Ampara"};
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        ListView listView = findViewById(R.id.citylist);

        if (getIntent().getIntExtra("Country", 0) == 0) {
            arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.list_item, R.id.tvCountryName, India);
        } else if (getIntent().getIntExtra("Country", 0) == 1) {
            arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.list_item, R.id.tvCountryName, Pakistan);
        } else if (getIntent().getIntExtra("Country", 0) == 2) {
            arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.list_item, R.id.tvCountryName, Sri_lanka);
        }
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(city.this, "click is Contry" + India[i], Toast.LENGTH_SHORT).show();
            }
        });

    }
}
