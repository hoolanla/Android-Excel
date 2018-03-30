package com.example.hoolanla.excel;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by hoolanla on 29/3/2018 AD.
 */

public class AppWebViewClients extends WebViewClient {



    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        // TODO Auto-generated method stub
        view.loadUrl(url);
        return true;
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        // TODO Auto-generated method stub
        super.onPageFinished(view, url);

    }
}

