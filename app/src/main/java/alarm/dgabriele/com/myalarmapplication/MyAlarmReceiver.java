package alarm.dgabriele.com.myalarmapplication;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by dgabriele on 23/04/2017.
 */

public class MyAlarmReceiver extends BroadcastReceiver {
    private static final String LOG_TAG=MyAlarmReceiver.class.getCanonicalName();
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(LOG_TAG,"onReceive");

        Intent service1 = new Intent(context, MyAlarmService.class);
        context.startService(service1);
    }


    public static void setAlarm(Context context) {
        Intent myIntent = new Intent(context, MyAlarmReceiver.class);

        PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 100, myIntent,PendingIntent.FLAG_UPDATE_CURRENT);
        AlarmManager alarmManager = (AlarmManager)context.getSystemService(Context.ALARM_SERVICE);
        alarmManager.setExact(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()+30000, pendingIntent); // Millisec * Second * Minute
    }
}
