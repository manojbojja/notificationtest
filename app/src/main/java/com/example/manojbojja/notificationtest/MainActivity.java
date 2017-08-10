package com.example.manojbojja.notificationtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.carnival.sdk.Carnival;
import com.carnival.sdk.NotificationConfig;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Carnival.startEngine(getApplicationContext(), "");

        NotificationConfig config = new NotificationConfig();
        config.setSmallIcon(R.drawable.ic_stat_notification);

        Carnival.setNotificationConfig(config);
    }
}
