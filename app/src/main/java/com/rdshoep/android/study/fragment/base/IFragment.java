package com.rdshoep.android.study.fragment.base;
/*
 * @description
 *   Please write the IFragment module's description
 * @author Zhang (rdshoep@126.com)
 *   http://www.rdshoep.com/
 * @version 
 *   1.0.0(11/5/2015)
 */

import com.rdshoep.android.study.activity.base.ActivityComponent;
import com.rdshoep.android.study.application.AppComponent;

public interface IFragment {

    AppComponent getAppComponent();

    ActivityComponent getActivityComponent();

    FragmentComponent getFragmentComponent();
}
