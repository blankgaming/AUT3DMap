package com.xxx.Dante;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button btnModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnModel = (Button) findViewById(R.id.btnModel);
        btnModel.setOnClickListener(this);

        WebView webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://maps.google.com/?ll=-36.852484,174.764480&z=23&t=k&size=1000x1000");
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, UnityPlayerActivity.class);
        startActivity(intent);
    }
}
