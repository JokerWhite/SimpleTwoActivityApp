package ru.kenzh.simpletwoactivityapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

/**
 * Created by Марат on 15.05.2015.
 */
public class SecondActivity extends Activity {
    protected WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_second_activity);

        webView = (WebView) findViewById(R.id.webView2);

        webView.loadUrl(getString(R.string.URL));
    }

    public void onClick (View view){
        finish();
    }
}
