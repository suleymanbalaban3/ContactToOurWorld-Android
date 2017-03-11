package com.example.slymn54.contacttoourworld;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.webkit.WebViewClient;
import android.webkit.WebView;

public class MainActivitySend extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    TextView tv;
    public  String message="";
    String result="";
    ImageButton ib;
    int status=0;
    double endex=0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int status=0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_send);
        Intent intent=getIntent();
        person personInfo=(person)intent.getSerializableExtra("sendObject");
        //String message=intent.getStringExtra(Main2Activity.EXTRA_MESSAGE);

        tv=(TextView)findViewById(R.id.secondText);
        endex=calculateEndex(personInfo);
        result+=checkCatagories(endex);
        result+="\n\nYönlendirme için resime týklayýnýz\n";
        tv.setText(result);
        guidance();

    }

    public double calculateEndex(person temp) {
        double res=temp.getWeight()/(temp.getHeight()*temp.getHeight())*10000;
        String junk=String.format("%.2f",res);
        result=temp.toString()+junk+"\n";
        return  res;
    }
    public String checkCatagories(double endex) {
        if(endex<=20) {
            status = 1;
            return "Düþük kilolusunuz :(\n";
        }
        else if(endex>20&&endex<=25) {
            status=2;
            return "Tebrikler kilonuz normal :)";
        }
        else if(endex>25&&endex<=30) {
            status = 3;
            return "Biraz kilolusunuz dikkat etmelisiniz :(";
        }
        else if(endex>30) {
            status = 4;
            return "Ciddi saðlýk probleminiz var :(:(";
        }
        return "";
    }
    public void guidance() {
        ib=(ImageButton) findViewById(R.id.imageButton);
        String imageName="";

        switch (status) {
            case 1 :
                ib.setBackgroundResource(R.drawable.zayif);
                message="https://www.diyetkolik.com/zayiflik-ciddi-bir-saglik-problemi/";
                break;
            case 2 : ib.setBackgroundResource(R.drawable.androthin);
                message="http://www.sabah.com.tr/cumartesi/2013/03/30/bu-yaziyi-okumadan-spor-yapmayin";
                break;
            case 3 :
                ib.setBackgroundResource(R.drawable.hafifkilo);
                message="http://iyigelenyiyecekler.com/hizli-kilo-vermenin-yollari/";
                break;
            case 4 :
                ib.setBackgroundResource(R.drawable.fat);
                message="http://obezitevakfi.com/";
                break;
        }
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivitySend.this, guide.class);
                intent.putExtra("com.example.myfirstapp.MESSAGE",message);
                startActivity(intent);
            }
        });
    }
}

