package com.rdshoep.android.study.data.service.impl;
/*
 * @description
 *   Please write the BaseService module's description
 * @author Zhang (rdshoep@126.com)
 *   http://www.rdshoep.com/
 * @version 
 *   1.0.0(11/5/2015)
 */

import com.rdshoep.android.study.application.BaseApplication;

public class BaseService {

    BaseApplication myApp;

    public BaseService(BaseApplication myApp) {
        this.myApp = myApp;
    }
}
