package com.study.heguodong;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by 01438511 on 2018/8/19.
 */

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    public static String TAG = "heguodong";
    private TextView some_info = null;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        some_info = findViewById(R.id.some_info);
        some_info.setOnClickListener(this);

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            Boom boom = (Boom)extras.get("xi_huan_ni");
            if ( null != boom){
                some_info.setText("" + boom);
                Log.e(TAG,"---------------------  201808191304 111111111--------------------- boom ---------------------" + boom);
            }else {
                some_info.setText("boom is null");
                Log.e(TAG,"---------------------  201808191304 111111111--------------------- boom ---------------------" +  "null");
            }

        }else {
            some_info.setText("未传递过来数据");
            Log.e(TAG,"---------------------  201808191304 111111111--------------------- 未传递过来数据 ---------------------" );
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.some_info:
                finish();
                break;
        }
    }
}
