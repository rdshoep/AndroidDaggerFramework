package com.rdshoep.android.study.activity.base;
/*
 * @description
 *   Please write the BaseActivity module's description
 * @author Zhang (rdshoep@126.com)
 *   http://www.rdshoep.com/
 * @version 
 *   1.0.0(11/5/2015)
 */

import com.rdshoep.android.study.application.AppComponent;
import com.rdshoep.android.study.application.BaseApplication;

public interface IBaseActivity {

    ActivityComponent getActivityComponent();

    AppComponent getAppComponent();

    BaseApplication getBaseApplication();
}
