package com.ts.iplay.base;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import org.xutils.x;

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化xutils的操作
        x.Ext.init(this);
        //设置是否输出日志
        x.Ext.setDebug(true);
//        //微信 appid appsecret
//        PlatformConfig.setWeixin("wx152334f54a39c3b0", "24949aef9a179c253fdd55f12a576632");
//        // QQ和Qzone appid appkey
//        PlatformConfig.setQQZone("100424468", "c7394704798a158208a74ab60104f0ba");
//        //极光推送初始化
//        JPushInterface.init(this);
//        JPushInterface.setDebugMode(true);//设置是否开启log日志，正式打包发布时建议关闭使用
    }
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
