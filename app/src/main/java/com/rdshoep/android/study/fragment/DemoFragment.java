package com.rdshoep.android.study.fragment;
/*
 * @description
 *   Please write the DemoFragment module's description
 * @author Zhang (rdshoep@126.com)
 *   http://www.rdshoep.com/
 * @version 
 *   1.0.0(11/6/2015)
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rdshoep.android.study.api.UserApi;
import com.rdshoep.android.study.data.service.UserService;
import com.rdshoep.android.study.fragment.base.BaseFragment;

import javax.inject.Inject;

public class DemoFragment extends BaseFragment {

    static final String TAG = "DemoFragment";

    @Inject
    UserService userService;
    @Inject
    UserApi userApi;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        getFragmentComponent().inject(this);

        Log.d(TAG, String.valueOf(userService));
        Log.d(TAG, String.valueOf(userApi));
    }
}
