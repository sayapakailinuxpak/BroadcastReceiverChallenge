package com.eldisprojectcodelabs.broadcastreceiverchallenge;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class HeadsetPlugReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals(Intent.ACTION_HEADSET_PLUG)){
            Toast.makeText(context, "Headset connected", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(context, "Headset Disconnected" , Toast.LENGTH_SHORT).show();
        }
    }
}
