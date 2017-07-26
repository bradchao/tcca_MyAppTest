package tw.brad.android.games.myapptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import static tw.brad.android.games.myapptest.MyApp.test;

public class Page2Activity extends AppCompatActivity {
    private MyApp myApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        myApp = (MyApp)getApplication();
        Log.i("brad", "stage = " + myApp.stage);

        Log.i("brad", "name = " + myApp.mainActivity.getName());
        Log.i("brad", "test is " + test);

    }
}
