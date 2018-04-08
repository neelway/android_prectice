package com.example.neeleshtripathi.login;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class homeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final EditText username = findViewById(R.id.username);
        final EditText password = findViewById(R.id.password);
        Button login = findViewById(R.id.login);
        Button register = findViewById(R.id.register);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname = username.getText().toString();
                String pwd = password.getText().toString();
                login(uname,pwd);

            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname = username.getText().toString();
                String pwd = password.getText().toString();
                register(uname,pwd);

            }
        });


    }
    public void register(String username,String password ){
        SQLiteDatabase db = this.openOrCreateDatabase("logindb",MODE_PRIVATE,null);
        db.execSQL("CREATE TABLE IF NOT EXISTS table1(usernmame VARCHAR,password VARCHAR)");
        db.execSQL("INSERT INTO table1 values ('"+ username +"','"+ password +"') " );
        db.execSQL("INSERT INTO table1 values ('123','abc') " );
        db.execSQL("INSERT INTO table1 values ('neel','123') " );
//        if(username==null) {
//            Log.i("registraion", "username empty");
//            Intent i =new Intent(homeActivity.this,homeActivity.class);
//            startActivity(i);
//            finish();
//        }
//        else
//        {
//            if(password==null)
//            {
//                Log.i("registraion", "password empty");
//                Intent i =new Intent(homeActivity.this,MainActivity.class);
//                startActivity(i);
//            }
//            else {
                Log.i("registraion", "scessfull");
           // }
        //}
    }
    public void login(String username,String password){
        SQLiteDatabase db = this.openOrCreateDatabase("logindb",MODE_PRIVATE,null);
         Cursor cs  = db.rawQuery("SELECT * FROM table1 WHERE username ='"+ username +"'",null);
       int nameindex = cs.getColumnIndex("username");
       int passindex = cs.getColumnIndex("password");

       cs.moveToFirst();
       String name = cs.getString(nameindex);
       String pwd = cs.getString(passindex);
       if(pwd.equals(password))
        {
            Intent i = new Intent(this.getApplicationContext(),loginActivity.class);
            i.putExtra("username",name);
            startActivity(i);
            finish();

        }
        else {
           Log.i("Login","failed");
       }


    }
}
