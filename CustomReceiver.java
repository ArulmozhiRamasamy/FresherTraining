package com.example.mybasiclogicapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Switch;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String intentAction=intent.getAction();
        String toastmessage=null;
        switch (intentAction){
            case Intent.ACTION_POWER_CONNECTED:
                toastmessage=context.getString(R.string.power_connected);
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                toastmessage=context.getString(R.string.power_disconnected);
                break;

        }
        Toast.makeText(context,toastmessage,Toast.LENGTH_LONG).show();
    }
}
