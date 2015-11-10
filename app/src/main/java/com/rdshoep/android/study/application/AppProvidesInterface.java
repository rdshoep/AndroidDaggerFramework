package com.rdshoep.android.study.application;
/*
 * @description
 *   Please write the AppProvidesInterface module's description
 * @author Zhang (rdshoep@126.com)
 *   http://www.rdshoep.com/
 * @version 
 *   1.0.0(11/10/2015)
 */

import com.rdshoep.android.study.api.UserApi;
import com.rdshoep.android.study.data.service.ServiceProvidesInterface;

public interface AppProvidesInterface extends ServiceProvidesInterface {

    UserApi userApi();
}
