package com.rdshoep.android.study.fragment.base;
/*
 * @description
 *   Please write the BaseFragment module's description
 * @author Zhang (rdshoep@126.com)
 *   http://www.rdshoep.com/
 * @version 
 *   1.0.0(11/5/2015)
 */

import android.app.Activity;
import android.support.v4.app.Fragment;

import com.rdshoep.android.study.activity.base.ActivityComponent;
import com.rdshoep.android.study.activity.base.IBaseActivity;
import com.rdshoep.android.study.application.AppComponent;
import com.rdshoep.android.study.application.BaseApplication;

public abstract class BaseFragment extends Fragment implements IFragment {
    AppComponent appComponent;
    ActivityComponent activityComponent;
    FragmentComponent fragmentComponent;

    @Override
    public AppComponent getAppComponent() {
        if (appComponent == null) {
            appComponent = ((BaseApplication) getActivity().getApplication())
                    .getApplicationComponent();
        }
        return appComponent;
    }

    @Override
    public ActivityComponent getActivityComponent() {
        if (activityComponent == null) {
            Activity activity = getActivity();
            if (activity != null) {
                if (activity instanceof IBaseActivity) {
                    activityComponent = ((IBaseActivity) activity).getActivityComponent();
                }
            }
        }
        return activityComponent;
    }

    @Override
    public FragmentComponent getFragmentComponent() {
        if(fragmentComponent == null){
            fragmentComponent = DaggerFragmentComponent.builder()
                    .fragmentModule(new FragmentModule())
                    .build();
        }
        return fragmentComponent;
    }
}
