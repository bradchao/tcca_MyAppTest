package tw.brad.android.games.myapptest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private MyApp myApp;
    private String name = "Brad";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myApp = (MyApp) getApplication();

        Log.i("brad", "Main: oncreate : " + myApp.stage);
        myApp.stage= 10;

        myApp.mainActivity = this;


    }

    public String getName(){
        return name;
    }

    public void gotoPage2(View v){
        Intent it = new Intent(this, Page2Activity.class);
        startActivity(it);
    }

}
