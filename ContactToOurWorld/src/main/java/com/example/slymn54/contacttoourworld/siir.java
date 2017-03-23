package com.example.slymn54.contacttoourworld;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;

public class siir extends AppCompatActivity {
    TextView tv;
    private int year,month,day;
    private Calendar calendar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siir);

        Intent intent=getIntent();

        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        tv=(TextView)findViewById(R.id.textView2);
        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);

        String twelve="Bugün tanışma günümüz :) :) .....xxx....xxx";
        String one="Bugün baslangıç günümüz :) :) ....xxxx.xxx.xxx";
        String[] rows = new String[20];
        rows[0]="Bir yol düşün ki hep aydınlık\n" +
                "Bir yarın düşle ki hiç dünde kalmayacak\n" +
                "Bir dünya hatırla ki gözlerimizi ilk açışımız\n" +
                "Bir kitap oku ki sonu bizle biten\n";
        rows[1]="Buralara siir yazabilirsiniz\n" +
                "Ben 12 adet ayrı yazmistim\n" +
                "xxxxxxxxxxxxxxxxxxxxxxxx\n" +
                "xxxxxxxxxxxx \n";
        rows[2]="xxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n" +
                "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n" +
                "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n" +
                "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n";
        rows[3]=rows[0];
        rows[4]=rows[0];
        rows[5]=rows[0];
        rows[6]=rows[0];
        rows[7]=rows[0];
        rows[8]=rows[0];
        rows[9]=rows[0];
        rows[10]=rows[0];
        rows[11]=rows[0];
        rows[12]=rows[0];
        if(day==3)
            tv.setText(one);
        else if(day==12)
            tv.setText(twelve);
        else
            tv.setText(rows[day%13]);


    }
}
