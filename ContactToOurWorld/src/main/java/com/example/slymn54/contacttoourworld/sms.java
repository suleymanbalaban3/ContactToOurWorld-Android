package com.example.slymn54.contacttoourworld;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class sms extends AppCompatActivity {
    private String name;
    private DatabaseReference root= FirebaseDatabase.getInstance().getReference().getRoot();
    TextView tv;
    String telno="05340760294";
    StringBuilder stringBuilder=new StringBuilder(250);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        Intent intent=getIntent();

        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        final EditText mesaj=(EditText)findViewById(R.id.editText);
        tv=(TextView)findViewById(R.id.textViewSend);
        Button gonder=(Button)findViewById(R.id.buttonSend);
        gonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                android.telephony.SmsManager sms=android.telephony.SmsManager.getDefault();
                sms.sendTextMessage(telno, null, mesaj.getText().toString(), null, null);
                stringBuilder.append(mesaj.getText());
                tv.setText(stringBuilder);
                mesaj.setText("");
            }
        });
    }
}