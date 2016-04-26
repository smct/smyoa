package com.cym.smyoa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.cym.smyoa.widget.MyFragmentTabHost;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.realtabcontent)
    FrameLayout mRealtabcontent;
    @InjectView(android.R.id.tabhost)
    MyFragmentTabHost mTabhost;
    @InjectView(R.id.tv_arcmenu)
    TextView mTvArcmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        initTab();

    }

    private void initTab() {

    }


}
