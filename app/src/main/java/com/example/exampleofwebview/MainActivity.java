package com.example.exampleofwebview;



import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView=findViewById(R.id.webView);
     ActionBar actionBar=getSupportActionBar();
     actionBar.setDisplayShowHomeEnabled(true);
     actionBar.setTitle("Google AI");

        setUpWebView(webView);

    }
    private void setUpWebView(WebView webviews){
        WebSettings webSettings=webviews.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webviews.loadUrl("https://blog.google/technology/ai/bard-google-ai-search-updates/");
        webviews.setWebViewClient(new WebViewClient());
    }

}