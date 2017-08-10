package com.example.manojbojja.notificationtest;

import android.app.Application;

import com.carnival.sdk.Carnival;
import com.carnival.sdk.NotificationConfig;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        NotificationConfig config = new NotificationConfig();
        config.setSmallIcon(R.drawable.ic_stat_notification);

        Carnival.setNotificationConfig(config);
        Carnival.startEngine(this, "");
    }
}
