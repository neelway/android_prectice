package com.example.neeleshtripathi.intentwithimage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button submitBtn;
    EditText usernameEdit,pwdEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitBtn=findViewById(R.id.LoginBTn);
        usernameEdit=findViewById(R.id.userEdit);
        pwdEdit=findViewById(R.id.pwdEdit);
        submitBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()== R.id.LoginBTn)
        {
            String userName=usernameEdit.getText().toString();
            String pwd=pwdEdit.getText().toString();
            if(userName.equalsIgnoreCase("neelesh")&& pwd.equalsIgnoreCase("neelesh"))
            {
                Intent intent = new Intent(MainActivity.this,Insttructor_screen.class);
                startActivity(intent);

            }
            else  if(userName.equalsIgnoreCase("student")&& pwd.equals("student")){
                Intent i = new Intent(MainActivity.this,Student_screen.class);
                startActivity(i);
            }
        }

    }
}
