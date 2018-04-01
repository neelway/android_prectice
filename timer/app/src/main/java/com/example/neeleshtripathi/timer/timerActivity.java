package com.example.neeleshtripathi.timer;

import android.database.sqlite.SQLiteDatabase;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

import static android.os.Build.ID;

public class timerActivity extends AppCompatActivity {


    private TextView countdownText;
    private  Button countdownButton;
    private CountDownTimer countDownTimer;
    private long timeleftMilles=600000;
    private  Boolean timerRunning=false;
    int progress=(int)timeleftMilles;
   public String TimeLeftText;
   public static int count=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);


        countdownText=findViewById(R.id.countDown);
        countdownButton=findViewById(R.id.start1);




        countdownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StartStop();
            }
        });

    }
    public void StartStop()
    {
        if(timerRunning){
            StopTimer();
        }
        else {
            StartTimer();
        }
    }
    public void StartTimer(){
        countDownTimer = new CountDownTimer(timeleftMilles,1000) {
            @Override
            public void onTick(long l) {
                timeleftMilles = l;
                UpadteTimer();
            }

            @Override
            public void onFinish() {

            }
        }.start();
        countdownButton.setText("Pause");
        timerRunning=true;
    }
        public void StopTimer(){
        countDownTimer.cancel();
        countdownButton.setText("Start");
        timerRunning=false;

            Calendar calendar = Calendar.getInstance();
            String Currentdate= DateFormat.getDateInstance().format(calendar.getTime());
            add(Currentdate,TimeLeftText);


    }
    public void UpadteTimer(){
        int mintus=(int)timeleftMilles / 60000;
        int sec=(int)(timeleftMilles % 60000) / 1000;

        TimeLeftText=""+mintus;
        TimeLeftText +=":";
        if(sec<10)TimeLeftText += 0;
        TimeLeftText += sec;
        countdownText.setText(TimeLeftText);


    }
    public void add(String Currentdate ,String TimeLeftText){

        SQLiteDatabase db =this.openOrCreateDatabase("filedb",MODE_PRIVATE,null);
        db.execSQL("CREATE TABLE IF NOT EXISTS table1(ID INTEGER PRIMARY KEY AUTOINCREMENT,date VARCHAR,duration VARCHAR)");
        db.execSQL("INSERT INTO table1 values('"+Currentdate+"','"+TimeLeftText+"')");
        Log.i("add:","working");
        Log.i("date",Currentdate);
        Log.i("time",TimeLeftText);
        //Log.i("data",filedb);
        //count++;


    }

}