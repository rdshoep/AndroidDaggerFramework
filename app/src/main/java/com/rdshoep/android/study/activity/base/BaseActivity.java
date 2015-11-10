package com.rdshoep.android.study.activity.base;
/*
 * @description
 *   Please write the BaseAppCompatActivity module's description
 * @author Zhang (rdshoep@126.com)
 *   http://www.rdshoep.com/
 * @version 
 *   1.0.0(11/5/2015)
 */

import android.app.Activity;
import android.os.Bundle;

import com.rdshoep.android.study.application.AppComponent;
import com.rdshoep.android.study.application.BaseApplication;

public abstract class BaseActivity extends Activity implements IBaseActivity {

    BaseApplication myApp;
    ActivityComponent activityComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        myApp = getBaseApplication();
    }

    @Override
    public ActivityComponent getActivityComponent() {
        if (activityComponent == null) {
            synchronized (this) {
                if (activityComponent == null) {
                    activityComponent = DaggerActivityComponent.builder()
                            .activityModule(new ActivityModule(this, getBaseApplication()))
                            .appComponent(myApp.getApplicationComponent())
                            .build();
                }
            }
        }
        return activityComponent;
    }

    @Override
    public BaseApplication getBaseApplication() {
        return (BaseApplication) getApplication();
    }
}
