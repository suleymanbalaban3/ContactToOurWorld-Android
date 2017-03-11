package com.example.slymn54.contacttoourworld;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class guide extends AppCompatActivity {
    WebView vw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        Intent intent=getIntent();
        String message=intent.getStringExtra(Main2Activity.EXTRA_MESSAGE);

        vw=(WebView)findViewById(R.id.webView2) ;
        vw.getSettings().setJavaScriptEnabled(true);
        vw.setWebViewClient(new WebViewClient());
        vw.loadUrl(message);
        final ProgressDialog progressDialog=ProgressDialog.show(guide.this,"","Yükleniyor...",true);
        progressDialog.show();
        vw.setWebViewClient(new WebViewClient(){
            public void onPageFinished(WebView view, String url) {
                Toast.makeText(getApplicationContext(), "Yüklendi!", Toast.LENGTH_LONG).show();
                progressDialog.dismiss();
            }
        });
    }
}
