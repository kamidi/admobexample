package com.ryan.admob.example;

import android.app.Activity;
import android.os.Bundle;
import com.google.ads.AdRequest;
import com.google.ads.AdView;

/**
 * Created by IntelliJ IDEA.
 * User: Ryan
 * Date: 11-11-9
 * Time: 下午5:33
 */
public class LayoutTest extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_test);
        //布局文件方式加入广告
        AdView adView1 = (AdView) this.findViewById(R.id.adView);
        AdRequest request = new AdRequest();
        request.setTesting(true);
        adView1.loadAd(request);
    }
}