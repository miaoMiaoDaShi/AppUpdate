package com.xxp.appupdate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.xxp.updatelibrary.AppUpdater;
import com.xxp.updatelibrary.CheckUpdater;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button button1;
    private Button button2;
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                AppUpdater appUpdater1 = new AppUpdater
                        .Builder(this,"http://xxpbox.cn/app/yangyan/appUpdate")
                        .setShowToDialog(false)
                        .setShowToStatusBar(true)
                        .build();
                CheckUpdater.getInstance().init(appUpdater1);
                break;
            case R.id.button2:
                AppUpdater appUpdater2 = new AppUpdater
                        .Builder(this,"http://xxpbox.cn/app/yangyan/appUpdate")
                        .setShowToDialog(true)
                        .setShowToStatusBar(false)
                        .build();
                CheckUpdater.getInstance().init(appUpdater2);
                break;
            case R.id.button3:
                AppUpdater appUpdater3 = new AppUpdater
                        .Builder(this,"http://xxpbox.cn/app/yangyan/appUpdate")
                        .setShowToDialog(true)
                        .setShowToStatusBar(true)
                        .build();
                CheckUpdater.getInstance().init(appUpdater3);
                break;
        }
    }
}
