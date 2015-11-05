package com.rdshoep.android.study.data.service.impl;
/*
 * @description
 *   Please write the UserServiceImpl module's description
 * @author Zhang (rdshoep@126.com)
 *   http://www.rdshoep.com/
 * @version 
 *   1.0.0(11/5/2015)
 */

import com.rdshoep.android.study.api.Api;
import com.rdshoep.android.study.application.BaseApplication;
import com.rdshoep.android.study.bean.User;
import com.rdshoep.android.study.data.service.UserService;

import javax.inject.Inject;

public class UserServiceImpl extends BaseService implements UserService {

    @Inject
    public UserServiceImpl(BaseApplication myApp, Api api) {
        super(myApp, api);
    }

    @Override
    public User loadUser() {
        return new User();
    }
}
