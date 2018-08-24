package com.cj.pushdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cj.library.PushUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PushUtil.pushInit(this);

    }
}
