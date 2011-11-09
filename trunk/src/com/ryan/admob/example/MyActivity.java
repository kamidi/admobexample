package com.ryan.admob.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.AdView;

public class MyActivity extends Activity {
    //将这里的 a14eb93891b7fd2 换成你的发布者 ID
    private String Publisher_ID = "a14eb93891b7fd2";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        //硬编码方式
        LinearLayout layout = (LinearLayout) findViewById(R.id.linearLayout);
        AdView adView = new AdView(this, AdSize.BANNER, Publisher_ID);
        // 把new出来的广告条加入到布局中
        layout.addView(adView);
        //新建一个广告请求
        AdRequest request = new AdRequest();
        request.setTesting(true);
        adView.loadAd(request);

        Button button = new Button(this);
        button.setText("Layout Model");
        layout.addView(button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MyActivity.this, LayoutTest.class);
                startActivity(intent);
            }
        });
    }
}
