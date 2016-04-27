package com.cym.smyoa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import com.cym.smyoa.bean.Tab;
import com.cym.smyoa.fragment.impl.DoingFragment;
import com.cym.smyoa.fragment.impl.DownFragment;
import com.cym.smyoa.fragment.impl.FriendFragment;
import com.cym.smyoa.fragment.impl.MessageFragment;
import com.cym.smyoa.widget.MyFragmentTabHost;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.realtabcontent)
    FrameLayout mRealtabcontent;
    @InjectView(android.R.id.tabhost)
    MyFragmentTabHost mTabhost;
    @InjectView(R.id.tv_arcmenu)
    ImageView mTvArcmenu;
    private LayoutInflater mInflater;
    private List<Tab> mTabsList = new ArrayList<>(5);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        initTab();


    }

    private void initTab() {
        mInflater = LayoutInflater.from(this);
        mTabhost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
        mTabsList.add(new Tab(DoingFragment.class, R.mipmap.widget_bar_me_nor, "Doing"));
        mTabsList.add(new Tab(MessageFragment.class, R.mipmap.widget_bar_me_nor, "信息"));
        mTabsList.add(new Tab(null, R.mipmap.widget_bar_me_nor, ""));
        mTabsList.add(new Tab(FriendFragment.class, R.mipmap.widget_bar_me_nor, "朋友"));
        mTabsList.add(new Tab(DownFragment.class, R.mipmap.widget_bar_me_nor, "应用"));
        initIndicator();

    }

    private void initIndicator() {
        for(int i=0;i<=4;i++){
            TabHost.TabSpec tabSpec = mTabhost.newTabSpec(mTabsList.get(i).getTitle());
            View view = buildeIndicator(mTabsList.get(i));
            if (i==2) {
                mTabhost.setNoTabChangedTag(mTabsList.get(i).getTitle());
                view.setVisibility(View.INVISIBLE);
            }
            tabSpec.setIndicator(view);
            mTabhost.addTab(tabSpec, mTabsList.get(i).getFragment(), null);
        }
        mTabhost.getTabWidget().setShowDividers(LinearLayoutCompat.SHOW_DIVIDER_NONE);
        mTabhost.setCurrentTab(0);
    }

    private View buildeIndicator(Tab tabs) {
        View view = mInflater.inflate(R.layout.tab_indicator, null);
        TextView tv = (TextView) view.findViewById(R.id.tab_title);
        //  tv.setText("主页");
        tv.setText(tabs.getTitle());
        // tv.setTextColor(r.C);
        System.out.println("title:" + tabs.getTitle());//
        //    iv.setBackgroundResource(tabs.getIcon());
        return view;
    }


    @OnClick(R.id.tv_arcmenu)
    public void onClick() {
        Toast.makeText(this,"Arcmenu",0).show();
    }


}
