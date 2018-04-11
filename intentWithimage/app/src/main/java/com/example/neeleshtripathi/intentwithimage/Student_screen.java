package com.example.neeleshtripathi.intentwithimage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Student_screen extends AppCompatActivity {
    Button Upload,numBtn;
    ImageView imgViw;
    EditText numEdt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_screen);
        Upload=findViewById(R.id.UploadPicture);
        imgViw=findViewById(R.id.img);
        numBtn=findViewById(R.id.button);
        numEdt=findViewById(R.id.numtxt);


        Upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,101);



            }
        });
        numBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num= "tel:"+numEdt.getText().toString();

                Intent intent1 = new Intent(Intent.ACTION_DIAL, Uri.parse(num));
                startActivity(intent1);

            }
        }); }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==101)
        {
            if(resultCode==RESULT_OK)
            {
                Bundle extraBundale = data.getExtras();
                Bitmap bitmap =  (Bitmap) extraBundale.get("data");
                imgViw.setImageBitmap(bitmap);
            }
            else if((resultCode==RESULT_CANCELED))
            {
                Toast.makeText(this,"canncle",Toast.LENGTH_SHORT).show();
            }
        }
    }


}
