package com.rdshoep.android.study.application;
/*
 * @description
 *   Please write the AppApplication module's description
 * @author Zhang (rdshoep@126.com)
 *   http://www.rdshoep.com/
 * @version 
 *   1.0.0(11/5/2015)
 */

import android.util.Log;

import com.rdshoep.android.study.data.service.UserService;
import com.rdshoep.android.study.data.service.ServiceModule;

import javax.inject.Inject;

public class AppApplication extends BaseApplication {
    static final String TAG = "AppApplication";

    @Inject
    UserService userService;

    @Override
    public void onCreate() {
        super.onCreate();
        component.inject(this);

        Log.d(TAG, String.valueOf(userService));
    }
}
