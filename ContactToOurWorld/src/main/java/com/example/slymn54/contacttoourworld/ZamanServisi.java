package com.example.slymn54.contacttoourworld;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Exclude;
import com.google.firebase.database.FirebaseDatabase;

public class ZamanServisi extends Service
{

    private String location="Gps closed";
    private Calendar calendar;
    private int year,month,day;
    private DatabaseReference root= FirebaseDatabase.getInstance().getReference().getRoot();
    private ArrayAdapter<String> arrayAdapter;
    Timer zamanlayici;
    Handler yardimci;

    final static long ZAMAN = 3600000;

    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }

    @Override
    public void onCreate()
    {
        super.onCreate();

        zamanlayici = new Timer();
        yardimci = new Handler(Looper.getMainLooper());

        zamanlayici.scheduleAtFixedRate(new TimerTask()
        {
            @Override
            public void run()
            {
                bilgiVer();
            }
        }, 0, ZAMAN);
    }

    private void bilgiVer()
    {
        long zaman = System.currentTimeMillis();

        SimpleDateFormat bilgi = new SimpleDateFormat("dd MMMM yyyy, EEEE / HH:mm");

        final String sonuc = bilgi.format(new Date(zaman));

        yardimci.post(new Runnable()
        {
            @Override
            public void run()
            {

                findLocation();

                Map<String,Object> map=new HashMap<String, Object>();
                map.put(sonuc,location);
                root.updateChildren(map);

            }
        });
    }

    @Override
    public void onDestroy()
    {
        zamanlayici.cancel();
        super.onDestroy();
    }
    public void findLocation() {
        LocationManager mlocManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);
        LocationListener mlocListener = new MyLocationListener();
        mlocManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, mlocListener);
    }

    public class MyLocationListener implements LocationListener

    {

        @Override
        public void onLocationChanged(Location loc)

        {
            loc.getLatitude();

            loc.getLongitude();

            String Text = "Latitud = " + loc.getLatitude() + ", Longitud = " + loc.getLongitude();


            location=Text;


        }

        @Override

        public void onProviderDisabled(String provider)

        {

            Toast.makeText( getApplicationContext(),"Gps Disabled", Toast.LENGTH_SHORT ).show();

        }


        @Override

        public void onProviderEnabled(String provider)

        {

            Toast.makeText(getApplicationContext(),"Gps Enabled",Toast.LENGTH_SHORT).show();

        }

        @Override

        public void onStatusChanged(String provider, int status, Bundle extras)

        {


        }

    }/* End of Class MyLocationListener */

}