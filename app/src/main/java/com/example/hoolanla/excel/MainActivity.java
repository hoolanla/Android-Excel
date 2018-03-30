package com.example.hoolanla.excel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView urlWebView = (WebView) findViewById(R.id.containWebView);
       urlWebView.setWebViewClient(new AppWebViewClients());
       urlWebView.getSettings().setJavaScriptEnabled(true);
        urlWebView.getSettings().setUseWideViewPort(true);
        urlWebView.loadUrl("http://docs.google.com/gview?embedded=true&url="
                + "http://www.sample-videos.com/xls/Sample-Spreadsheet-10-rows.xls");

    }


}



