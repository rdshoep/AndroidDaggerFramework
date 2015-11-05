package com.rdshoep.android.study.application;
/*
 * @description
 *   Please write the ApplicationComponent module's description
 * @author Zhang (rdshoep@126.com)
 *   http://www.rdshoep.com/
 * @version 
 *   1.0.0(11/5/2015)
 */

import com.rdshoep.android.study.activity.ActivityComponentInterface;
import com.rdshoep.android.study.api.Api;
import com.rdshoep.android.study.dagger.ApplicationLife;
import com.rdshoep.android.study.data.service.ServiceModule;
import com.rdshoep.android.study.data.service.UserService;
import com.rdshoep.android.study.fragment.FragmentComponentInterface;

import dagger.Component;

@ApplicationLife
@Component(
        modules = {
                AppModule.class,
                ServiceModule.class
        }
)
public interface AppComponent extends ActivityComponentInterface, FragmentComponentInterface {
    void inject(AppApplication application);

    Api apiClient();

    UserService userService();
}
