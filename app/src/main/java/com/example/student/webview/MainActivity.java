package com.example.student.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wv = (WebView) findViewById(R.id.webview);
        wv.getSettings().setJavaScriptEnabled(true);//可抓JAVAScrip語法
        wv.getSettings().setSupportZoom(true);//設定縮放大小
        wv.getSettings().setBuiltInZoomControls(true);//設定縮放大小
        wv.setWebViewClient(new WebViewClient());
//        wv.loadUrl("https://www.hitobp.com.tw/");
        wv.loadUrl("file:///android_asset/index.html");
    }
    @Override
    public void onBackPressed(){
        if(wv.getUrl().contains("index.html"))
        {
            super.onBackPressed();
            Log.d("wv", "返回成功");
        }
        else {
            //如果不是就返回
            wv.goBack();
        }
    }
}
