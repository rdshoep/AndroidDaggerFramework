package com.rdshoep.android.study.activity.base;
/*
 * @description
 *   Please write the ActivityModule module's description
 * @author Zhang (rdshoep@126.com)
 *   http://www.rdshoep.com/
 * @version 
 *   1.0.0(11/5/2015)
 */

import com.rdshoep.android.study.application.AppApplication;
import com.rdshoep.android.study.application.BaseApplication;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule{
    IBaseActivity baseActivity;
    AppApplication myApp;

    public ActivityModule(IBaseActivity baseActivity, BaseApplication baseApplication) {
        this.baseActivity = baseActivity;

        if (baseApplication instanceof AppApplication) {
            myApp = (AppApplication) baseApplication;
        }
    }

    @Provides
    BaseApplication getBaseApplication() {
        return myApp;
    }
}
