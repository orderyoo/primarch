package com.example.primarchinfohtml;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class HtmlActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html);

        String description  = getIntent().getStringExtra("description");
        WebView myWebView = (WebView) findViewById(R.id.webb);
        myWebView.loadUrl("file:///android_asset/" + description + ".html");
    }
    public void buttonBack(View view){
        finish();
    }
}