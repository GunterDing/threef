package com.threef;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.jpush.android.api.JPushInterface;

public class MainActivity extends Activity {

    @BindView(R.id.act_aliyun)
    TextView actAliyun;
    @BindView(R.id.act_jiguang)
    TextView actJiguang;
    @BindView(R.id.act_xiaomi)
    TextView actXiaomi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

    @OnClick({R.id.act_aliyun, R.id.act_jiguang, R.id.act_xiaomi})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.act_aliyun:

                break;
            case R.id.act_jiguang:

                break;
            case R.id.act_xiaomi:
                break;
        }
    }
}
