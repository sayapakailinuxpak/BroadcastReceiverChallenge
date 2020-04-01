package com.eldisprojectcodelabs.broadcastreceiverchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    HeadsetPlugReceiver headsetPlugReceiver = new HeadsetPlugReceiver();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        broadcastHeadsetPlugStatus();
    }

    private void broadcastHeadsetPlugStatus() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Intent.ACTION_HEADSET_PLUG);
        this.registerReceiver(headsetPlugReceiver, intentFilter);
    }

    @Override
    protected void onDestroy() {
        this.unregisterReceiver(headsetPlugReceiver);
        super.onDestroy();
    }
}
