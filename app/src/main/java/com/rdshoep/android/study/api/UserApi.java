package com.rdshoep.android.study.api;
/*
 * @description
 *   Please write the UserApi module's description
 * @author Zhang (rdshoep@126.com)
 *   http://www.rdshoep.com/
 * @version 
 *   1.0.0(11/6/2015)
 */

import android.app.Application;
import android.util.Log;

import com.rdshoep.android.study.bean.User;
import com.rdshoep.android.study.dagger.ApplicationLife;

import javax.inject.Inject;

@ApplicationLife
public class UserApi {

    static final String TAG = "UserApi";

    @Inject
    public UserApi(Application app){}

    public void loadUserList(int companyId, RequestCallback<User> callback){
        Log.d(TAG, "request:LoadUserList");
    }
}
