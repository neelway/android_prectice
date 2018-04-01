package com.example.neeleshtripathi.timer;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.text.FieldPosition;
import java.util.ArrayList;

public class privius_reading extends AppCompatActivity {

    public String TimeLeftText;
   static ArrayList<String> al = new ArrayList<>();
    static ArrayAdapter<String> ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privius_reading);
        ListView listView = findViewById(R.id.lst);


        SQLiteDatabase db = this.openOrCreateDatabase("filedb",MODE_PRIVATE,null);
        Cursor cs  = db.rawQuery("SELECT * FROM table1",null);
        //int ID = cs.getColumnIndex("ID");
        int date = cs.getColumnIndex("date");
        int duration = cs.getColumnIndex("duration");


        cs.moveToFirst();


        while(cs.moveToNext()!=false) {
            String datep = cs.getString(date);
            String durtion1 = cs.getString(duration);


            // Log.i("datecol: ",cs.getColumnName(duration));
            //Log.i("add",datep);
            // Log.i("duration:", durtion1);
            // al.add(name);

            al.add(datep);
            al.add(durtion1);
        }


         ad = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,al);
        listView.setAdapter(ad);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Log.i("clicked",String.valueOf(position));
            }
        });

    }
public void  sum()
{
    SQLiteDatabase db = this.openOrCreateDatabase("filedb",MODE_PRIVATE,null);
   Cursor cs  = db.rawQuery("SELECT * FROM table1",null);
    //int id = cs.getColumnIndex("id");
    int date = cs.getColumnIndex("date");
    int duration = cs.getColumnIndex("duration");


    cs.moveToFirst();
    //String name = cs.getString(id);
    //String datep = cs.getString(date);
    String durtion1 =cs.getString(duration);

     Log.i("datecol: ",cs.getColumnName(duration));
     Log.i("add",cs.getString(date));
     Log.i("duration:", durtion1);



}

}

