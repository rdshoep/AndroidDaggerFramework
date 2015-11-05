package com.rdshoep.android.study.data.service;
/*
 * @description
 *   Please write the DataModule module's description
 * @author Zhang (rdshoep@126.com)
 *   http://www.rdshoep.com/
 * @version 
 *   1.0.0(11/5/2015)
 */

import com.rdshoep.android.study.api.Api;
import com.rdshoep.android.study.application.BaseApplication;
import com.rdshoep.android.study.dagger.ApplicationLife;
import com.rdshoep.android.study.data.service.impl.UserServiceImpl;

import dagger.Module;
import dagger.Provides;

@Module
public class ServiceModule {

    BaseApplication myApp;
    Api api;

    public ServiceModule(BaseApplication myApp, Api api) {
        this.myApp = myApp;
        this.api = api;
    }

    @Provides
    @ApplicationLife
    UserService providesUserService() {
        return new UserServiceImpl(myApp, api);
    }
}
