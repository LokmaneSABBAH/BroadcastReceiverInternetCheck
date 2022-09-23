package com.example.brodcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    static Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);

        MyReceiver myReceiver = new MyReceiver();
        IntentFilter inf = new IntentFilter();
        inf.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        inf.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        registerReceiver(myReceiver, inf);



    }

    public static void enabledButton(boolean action){

            btn.setEnabled(action);

    }


}