package com.example.slymn54.contacttoourworld;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class twitter extends AppCompatActivity {
    WebView vw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter);

        Intent intent=getIntent();

        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        vw=(WebView)findViewById(R.id.webView2) ;
        vw.getSettings().setJavaScriptEnabled(true);
        vw.setWebViewClient(new WebViewClient());
        vw.loadUrl("https://twitter.com/slymn_blbn");
        final ProgressDialog progressDialog=ProgressDialog.show(twitter.this,"","Loading for Yesim...",true);
        progressDialog.show();
        vw.setWebViewClient(new WebViewClient(){
            public void onPageFinished(WebView view, String url) {
                Toast.makeText(getApplicationContext(), "Loaded!", Toast.LENGTH_LONG).show();
                progressDialog.dismiss();
            }
        });
    }
}
