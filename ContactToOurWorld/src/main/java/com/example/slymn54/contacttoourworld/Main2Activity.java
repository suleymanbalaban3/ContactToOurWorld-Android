package com.example.slymn54.contacttoourworld;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.Serializable;


public class Main2Activity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    EditText et, et1, et2, et3;
    person personInfo;
    ImageView iv;
    ImageButton ib;
    RotateAnimation ra = new RotateAnimation(0.0f, 720.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent=getIntent();


        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        ra.setDuration(4000);

        iv = (ImageView) findViewById(R.id.imageView);
        ib = (ImageButton) findViewById(R.id.imageButton);

        iv.setImageResource(R.drawable.image);
        ib.setImageResource(R.drawable.image2);
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this, "Ýþleminiz gerçekleþtiriliyor", Toast.LENGTH_SHORT).show();
                ib.startAnimation(ra);
                sendMessage(v);
            }
        });

    }

    /**
     * @param view
     */
    public void sendMessage(View view) {
        Intent intent = new Intent(Main2Activity.this, MainActivitySend.class);


        et = (EditText) findViewById(R.id.editText);
        et1 = (EditText) findViewById(R.id.editText1);
        et2 = (EditText) findViewById(R.id.editText2);
        et3 = (EditText) findViewById(R.id.editText3);

        if( isCorrect(et,et1,et2,et3)) {
            personInfo = new person(et.getText().toString(), et1.getText().toString()
                    , Integer.parseInt(et2.getText().toString()), Integer.parseInt(et3.getText().toString()));
            et.setText("");
            et1.setText("");
            et2.setText("");
            et3.setText("");
            intent.putExtra("sendObject", (Serializable) personInfo);
            startActivity(intent);
        }
    }
    public boolean isCorrect(EditText temp,EditText temp1,EditText temp2,EditText temp3) {
        if(et.getText().toString().isEmpty()||et1.getText().toString().isEmpty()||
                et2.getText().toString().isEmpty()||et3.getText().toString().isEmpty()) {
            Toast.makeText(Main2Activity.this, "Eksik bilgi girdiniz!", Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }
}