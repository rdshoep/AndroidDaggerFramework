package com.rdshoep.android.study.activity.base;
/*
 * @description
 *   Please write the ActivityComponent module's description
 * @author Zhang (rdshoep@126.com)
 *   http://www.rdshoep.com/
 * @version 
 *   1.0.0(11/5/2015)
 */

import com.rdshoep.android.study.activity.ActivityComponentInterface;
import com.rdshoep.android.study.activity.ActivityProvidesInterface;
import com.rdshoep.android.study.application.AppComponent;
import com.rdshoep.android.study.dagger.ActivityLife;

import dagger.Component;

@ActivityLife
@Component(
        modules = {
                ActivityModule.class
        },
        dependencies = {
                AppComponent.class
        }
)
public interface ActivityComponent extends ActivityComponentInterface, ActivityProvidesInterface {
}
