package cn.oneclicks.answer.application;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;


public class MyApplication extends Application {
    private static Context context;

    public static Context getContext() {
        return context;
    }

    public static String getVersion() {
        try {
            PackageManager manager = context.getPackageManager();
            PackageInfo info = manager.getPackageInfo(context.getPackageName(), 0);
            String version = info.versionName;
            return version;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();

    }
}
