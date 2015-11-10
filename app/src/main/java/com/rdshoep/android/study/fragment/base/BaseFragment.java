package com.rdshoep.android.study.fragment.base;
/*
 * @description
 *   Please write the BaseFragment module's description
 * @author Zhang (rdshoep@126.com)
 *   http://www.rdshoep.com/
 * @version 
 *   1.0.0(11/5/2015)
 */

import android.support.v4.app.Fragment;

import com.rdshoep.android.study.activity.base.IBaseActivity;

public abstract class BaseFragment extends Fragment implements IFragment {
    FragmentComponent fragmentComponent;

    @Override
    public FragmentComponent getFragmentComponent() {
        if(fragmentComponent == null){
            IBaseActivity baseActivity = (IBaseActivity) getActivity();
            fragmentComponent = DaggerFragmentComponent.builder()
                    .fragmentModule(new FragmentModule())
                    .activityComponent(baseActivity.getActivityComponent())
                    .build();
        }
        return fragmentComponent;
    }
}
