package com.example.n9262.news_demo;

import android.app.Application;

import cn.bmob.v3.Bmob;

/**
 * Created by n9262 on 2017/6/11.
 */
public class NewsApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Bmob.initialize(this, "fa5e0d2c65b90bd831ac7556c9b56356a35");
    }
}
