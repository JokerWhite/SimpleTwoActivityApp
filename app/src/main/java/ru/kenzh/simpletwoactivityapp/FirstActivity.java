package ru.kenzh.simpletwoactivityapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

/**
 * Created by Марат on 15.05.2015.
 */
public class FirstActivity  extends Activity {
    protected WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_first_activity);

        webView = (WebView) findViewById(R.id.webView1);
        webView.loadUrl(getString(R.string.URL));
    }

    public void onClick (View view){
        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}
