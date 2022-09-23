package com.example.brodcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        if(networkInfo!=null){
            //Toast.makeText(context, "connection exists", Toast.LENGTH_LONG).show();
            MainActivity.enabledButton(true);
        }
        else{
            //Toast.makeText(context, "connection not exists", Toast.LENGTH_LONG).show();
            MainActivity.enabledButton(false);
        }
    }
}