package com.rdshoep.android.study.application;
/*
 * @description
 *   Please write the AndroidModule module's description
 * @author Zhang (rdshoep@126.com)
 *   http://www.rdshoep.com/
 * @version 
 *   1.0.0(11/5/2015)
 */

import android.app.Application;

import com.rdshoep.android.study.dagger.ApplicationLife;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    BaseApplication myApp;

    public AppModule(BaseApplication application) {
        this.myApp = application;
    }

    @Provides
    @ApplicationLife
    public Application apiClient() {
        return myApp;
    }
}
