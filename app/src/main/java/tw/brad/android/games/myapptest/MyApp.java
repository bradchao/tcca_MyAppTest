package tw.brad.android.games.myapptest;

import android.app.Application;
import android.util.Log;

public class MyApp extends Application {
    public int stage;
    public MainActivity mainActivity;

    public static String test = "Hello";


    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("brad", "app: onCreate");
        stage = 0;
    }
}
