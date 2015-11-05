package com.rdshoep.android.study.activity.base;
/*
 * @description
 *   Please write the BaseAppCompantActivity module's description
 * @author Zhang (rdshoep@126.com)
 *   http://www.rdshoep.com/
 * @version 
 *   1.0.0(11/5/2015)
 */

import android.support.v7.app.AppCompatActivity;

import com.rdshoep.android.study.application.AppComponent;
import com.rdshoep.android.study.application.BaseApplication;

public class BaseAppCompatActivity extends AppCompatActivity implements IBaseActivity {
    ActivityComponent activityComponent;

    @Override
    public ActivityComponent getActivityComponent() {
        if (activityComponent == null) {
            synchronized (this) {
                if (activityComponent == null) {
                    activityComponent = DaggerActivityComponent.builder()
                            .activityModule(new ActivityModule(this, getBaseApplication()))
                            .build();
                }
            }
        }
        return activityComponent;
    }

    @Override
    public AppComponent getAppComponent() {
        return getBaseApplication().getApplicationComponent();
    }

    @Override
    public BaseApplication getBaseApplication() {
        return (BaseApplication) getApplication();
    }
}
