package com.aspsine.podcast;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.StrictMode;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by Aspsine on 2015/4/13.
 */
public class App extends Application{
    private static Context context;

    @Override
    public void onCreate() {
        setStrictMode();
        super.onCreate();
        context = getApplicationContext();
        CrashHandler.getInstance(getApplicationContext());
    }

    public static Context getContext(){
        return context;
    }

    /**
     * issue: retrofit Memory leak in StrickMode
     * https://github.com/square/retrofit/issues/801
     */
    private void setStrictMode() {
        if (BuildConfig.DEBUG && Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD) {
            StrictMode.enableDefaults();
        }
    }
}
