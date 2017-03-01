package com.dictionary.codebhak;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Marathi_Kolhapur extends AppCompatActivity {
    WebView mWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marathi__kolhapur);
        ActionBar actionBar = getActionBar();
        mWebView = (WebView) findViewById(R.id.webview);

        // Loading an html page into webview
        mWebView.loadUrl("file:///android_asset/marathi_city/kolhapur.html");
    }
}
