package com.study.heguodong.app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String TAG = "heguodong";
    private TextView hello = null ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hello = findViewById(R.id.hello);
        hello.setOnClickListener(this);

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            Object boom = extras.get("xi_huan_ni");
            if ( null != boom){
                hello.setText("" + boom);
                Log.e(TAG,"---------------------  201808191304 22222222--------------------- boom ---------------------" + boom);
            }else {
                hello.setText("boom is null");
                Log.e(TAG,"---------------------  201808191304 22222222--------------------- boom ---------------------" +  "null");
            }

        }else {
            hello.setText("未传递过来数据");
            Log.e(TAG,"---------------------  201808191304 22222222--------------------- 未传递过来数据 ---------------------" );
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.hello:
                finish();
                break;
        }
    }
}
