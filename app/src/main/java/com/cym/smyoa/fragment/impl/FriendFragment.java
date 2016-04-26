package com.cym.smyoa.fragment.impl;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cym.smyoa.R;

/**
 * ========================
 * CYM
 */
public class FriendFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.friendfragment,container,false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
