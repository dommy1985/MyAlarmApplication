package alarm.dgabriele.com.myalarmapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG=MainActivity.class.getCanonicalName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        MyAlarmReceiver.setAlarm(this);
//            Log.d(LOG_TAG, "Assente");
//        }
    }
}
