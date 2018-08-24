package com.cj.pushdemo;

import android.app.Application;

import com.umeng.commonsdk.UMConfigure;
import com.umeng.message.IUmengRegisterCallback;
import com.umeng.message.PushAgent;

/**
 * desc
 *
 * @author chenjing
 * @date 2018/8/24
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        UMConfigure.setLogEnabled(true);
        UMConfigure.init(this, "5b7fc40db27b0a40a6000033", "", UMConfigure.DEVICE_TYPE_PHONE,"90b9be4c85546561c35215e89cfcc5b3");
        PushAgent mPushAgent = PushAgent.getInstance(this);
        //注册推送服务，每次调用register方法都会回调该接口
        mPushAgent.register(new IUmengRegisterCallback() {
            @Override
            public void onSuccess(String deviceToken) {
            }
            @Override
            public void onFailure(String s, String s1) {
            }
        });

    }
}
