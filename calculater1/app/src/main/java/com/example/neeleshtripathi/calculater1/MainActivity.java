package com.example.neeleshtripathi.calculater1;

        import android.os.Bundle;
        import android.app.Activity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
public class MainActivity extends Activity {
     Button zero,one , two, three , four , five, six, seven, eight, nine, add,sub,mul,div,equal;
     TextView givenum, result;
     final char ad = '+';
     final char eq = 0;
     final char su = '-';
     final char mu = '*';
     final char di = '/';
     double value1 = Double.NaN;
     double value2;
     char ch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zero = findViewById(R.id.Zero);
        one= findViewById(R.id.One);
        two = findViewById(R.id.Two);
        three = findViewById(R.id.Three);
        four = findViewById(R.id.Four);
        five = findViewById(R.id.Five);
        six = findViewById(R.id.Six);
        seven = findViewById(R.id.Seven);
        eight = findViewById(R.id.Eight);
        nine = findViewById(R.id.Nine);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        givenum = findViewById(R.id.value);
        result = findViewById(R.id.result);
        equal = findViewById(R.id.equal);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // TODO Auto-generated method stub
                givenum.setText(givenum.getText().toString() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // TODO Auto-generated method stub
                givenum.setText(givenum.getText().toString() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // TODO Auto-generated method stub
                givenum.setText(givenum.getText().toString() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // TODO Auto-generated method stub
                givenum.setText(givenum.getText().toString() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // TODO Auto-generated method stub
                givenum.setText(givenum.getText().toString() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // TODO Auto-generated method stub
                givenum.setText(givenum.getText().toString() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // TODO Auto-generated method stub
                givenum.setText(givenum.getText().toString() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // TODO Auto-generated method stub
                givenum.setText(givenum.getText().toString() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // TODO Auto-generated method stub
                givenum.setText(givenum.getText().toString() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // TODO Auto-generated method stub
                givenum.setText(givenum.getText().toString() + "9");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // TODO Auto-generated method stub
                choice();
                ch = ad;
                result.setText(String.valueOf(value1)+"+");
                givenum.setText(null);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // TODO Auto-generated method stub
                choice();
                ch= su;
                result.setText(String.valueOf(value1) + "-");
                givenum.setText(null);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // TODO Auto-generated method stub
                choice();
                ch = mu;
                result.setText(String.valueOf(value1) + "*");
                givenum.setText(null);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // TODO Auto-generated method stub
                choice();

                ch = di;
                result.setText(String.valueOf(value1) + "/");
                givenum.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // TODO Auto-generated method stub
                choice();
                ch = eq;

                givenum.setText(givenum.getText().toString() + String.valueOf(value2) );
                result.setText(String.valueOf(value1));
                givenum.setText(null);
            }
        });
    }
    private void choice(){
        if(!Double.isNaN(value1)){
            value2 = Double.parseDouble(givenum.getText().toString());
            switch(ch){

                case mu:
                    value1 = value1 * value2;
                    break;
                case di:
                    value1 = value1 / value2;
                    break;
                case ad:
                    value1 = value1 + value2;
                    break;
                case su:
                    value1 = value1 - value2;
                    break;
                case eq:
                    break;
            }

        }

        else{

            value1 = Double.parseDouble(givenum.getText().toString());
        }

    }
}