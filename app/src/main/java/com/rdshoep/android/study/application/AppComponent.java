package com.rdshoep.android.study.application;
/*
 * @description
 *   Please write the ApplicationComponent module's description
 * @author Zhang (rdshoep@126.com)
 *   http://www.rdshoep.com/
 * @version 
 *   1.0.0(11/5/2015)
 */

import com.rdshoep.android.study.dagger.ApplicationLife;
import com.rdshoep.android.study.data.service.ServiceModule;

import dagger.Component;

@ApplicationLife
@Component(
        modules = {
                AppModule.class,
                ServiceModule.class
        }
)
public interface AppComponent extends AppProvidesInterface {
    void inject(AppApplication application);
}
