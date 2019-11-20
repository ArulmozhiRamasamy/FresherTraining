package com.example.mybasiclogicapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import android.widget.Switch;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {

    @Override public void onReceive(final Context context, Intent intent) {

        String action = intent.getAction();
        Log.v("PlugInControlReceiver","action: "+action);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){

            if(action.equals("android.hardware.usb.action.USB_STATE")) {

                if(intent.getExtras().getBoolean("connected")){

                    Toast.makeText(context, "USB Connected", Toast.LENGTH_SHORT).show();
                }else{

                    Toast.makeText(context, "USB Disconnected", Toast.LENGTH_SHORT).show();
                }
            }
        } else {
            if(action.equals(Intent.ACTION_POWER_CONNECTED)) {

                Toast.makeText(context, "USB Connected", Toast.LENGTH_SHORT).show();
            }
            else if(action.equals(Intent.ACTION_POWER_DISCONNECTED)) {

                Toast.makeText(context, "USB Disconnected", Toast.LENGTH_SHORT).show();
            }
        }
    }
}

