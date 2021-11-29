package com.project.mlvbv2demo;

import android.app.Application;
import android.util.Log;

import com.tencent.rtmp.TXLiveBase;

public class MyApplication extends Application {

    String  licenceUrl = "";
    String  licenseKey = "";

    @Override
    public void onCreate() {
        super.onCreate();
        TXLiveBase.getInstance().setLicence(this, licenceUrl, licenseKey);
        String sdkVersionStr = TXLiveBase.getSDKVersionStr();
        Log.e("lin", "----------   sdkVersionStr="+sdkVersionStr);

    }
}
