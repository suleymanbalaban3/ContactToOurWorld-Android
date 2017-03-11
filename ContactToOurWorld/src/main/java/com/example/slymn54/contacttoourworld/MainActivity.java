package com.example.slymn54.contacttoourworld;

import android.app.ActivityManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private DatePicker datePicker;
    private Calendar calendar;
    RelativeLayout rl;
    private boolean admin=true;
    private ImageView iv1;
    private TextView tv;
    private int year,month,day;

    ListView listView;
    List<Islem> islemler=new ArrayList<Islem>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(!servisCalisiyorMu())
            startService(new Intent(this, ZamanServisi.class));


        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);

        together(2014,1,3);
        photoManage();

        islemler.add(new Islem("Siir","Beden Kitle"));
        islemler.add(new Islem("Sms","Arama"));
        islemler.add(new Islem("Facebook","Twitter"));
        islemler.add(new Islem("insta","GtuMat"));

        listView=(ListView)findViewById(R.id.listView);

        OzelAdapter adapter=new OzelAdapter(this,islemler);
        listView.setAdapter(adapter);

    }
    private void photoManage() {
        iv1=(ImageView)findViewById(R.id.imageView);

        int randomNum=day%8;
        if(month==10&&day==5)
             iv1.setImageResource(R.drawable.dg3);
        else if(day==3)
            iv1.setImageResource(R.drawable.hvf);
        else if(day==12)
            iv1.setImageResource(R.drawable.dlk);
        else {
            iv1.setImageResource(R.drawable.dtc);
        }
    }
    private void together(int firstYear,int firstMonth,int firstDay) {
        int resYear,resMonth,resDay;
        tv=(TextView)findViewById(R.id.textView);
        if(firstMonth>month) {
            year--;
            month+=12;
        }
        if(firstDay>day) {

            month--;
            day+=30;
        }
        resYear=year-firstYear;
        resMonth=month-firstMonth;
        resDay=day-firstDay;

        tv.setText("Welcome To Our World\n"+Integer.toString(resYear)+" Years "+
                Integer.toString(resMonth+1)+" Months "+Integer.toString(resDay)+" Days Together");
    }
    private boolean servisCalisiyorMu()
    {
        ActivityManager servisYoneticisi = (ActivityManager) getSystemService(ACTIVITY_SERVICE);

        for(ActivityManager.RunningServiceInfo servis : servisYoneticisi.getRunningServices(Integer.MAX_VALUE))
        {
            if (getApplication().getPackageName().equals(servis.service.getPackageName()))
            {
                return true;
            }
        }
        return false;
    }
    public void dugmeServisTikla(View v)
    {
        Button dugme = (Button) v;
        //startService(new Intent(this, ZamanServisi.class));
    /*
        if(servisCalisiyorMu())
        {
            stopService(new Intent(this, ZamanServisi.class));
            dugme.setText(getString(R.string.baslat));
        }
        else
        {
            startService(new Intent(this, ZamanServisi.class));
            dugme.setText(getString(R.string.durdur));
        }
        */
    }


}