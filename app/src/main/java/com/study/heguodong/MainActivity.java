package com.study.heguodong;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 *
 *
 * https://www.jianshu.com/p/5bda6d6b303a
 *
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static String TAG = "heguodong";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.open_own).setOnClickListener(this);
        findViewById(R.id.open_other).setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.open_own :
                Intent intent1 = new Intent();

                intent1.setComponent(new ComponentName("com.study.heguodong", "com.study.heguodong.SecondActivity"));

                intent1.putExtra("xi_huan_ni", new Boom());

                Log.e(TAG,"---------------------  201808191304 11111111--------------------- startActivity ---------------------");

                startActivity(intent1);

                break;
            case R.id.open_other :
                Intent intent2 = new Intent();

                intent2.setComponent(new ComponentName("com.study.heguodong.app2", "com.study.heguodong.app2.MainActivity"));

                intent2.putExtra("xi_huan_ni", new Boom());

                Log.e(TAG,"---------------------  201808191304 22222222--------------------- startActivity ---------------------");

                startActivity(intent2);

                break;
        }
    }
}
