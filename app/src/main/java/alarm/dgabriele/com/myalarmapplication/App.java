package alarm.dgabriele.com.myalarmapplication;

import android.app.Application;

import com.bugfender.sdk.Bugfender;

/**
 * Created by dgabriele on 23/04/2017.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Bugfender.init(this, "ubzqFjx1bBxEc3b0196sOw1dF1t9c1E3", BuildConfig.DEBUG);
        Bugfender.enableLogcatLogging();
        Bugfender.enableUIEventLogging(this);
    }
}
