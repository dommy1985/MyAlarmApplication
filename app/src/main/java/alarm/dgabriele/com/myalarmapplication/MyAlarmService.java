package alarm.dgabriele.com.myalarmapplication;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.IntentService;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.Log;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by dgabriele on 23/04/2017.
 */

public class MyAlarmService extends IntentService{
    private static final String LOG_TAG=MyAlarmService.class.getCanonicalName();

    public MyAlarmService() {
        super(LOG_TAG);
        Log.d(LOG_TAG,"MyAlarmService");

    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d(LOG_TAG,"onHandleIntent ");
        MyAlarmReceiver.setAlarm(this);
    }

}
