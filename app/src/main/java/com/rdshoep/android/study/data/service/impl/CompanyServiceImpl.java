package com.rdshoep.android.study.data.service.impl;
/*
 * @description
 *   Please write the CompanyServiceImpl module's description
 * @author Zhang (rdshoep@126.com)
 *   http://www.rdshoep.com/
 * @version 
 *   1.0.0(11/5/2015)
 */

import com.rdshoep.android.study.bean.Company;
import com.rdshoep.android.study.bean.User;
import com.rdshoep.android.study.data.service.CompanyService;
import com.rdshoep.android.study.data.service.UserService;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

public class CompanyServiceImpl implements CompanyService {

    @Inject
    UserService userService;

    @Override
    public Company getCompany() {
        return new Company();
    }

    @Override
    public List<User> getMembers() {
        return Arrays.asList(userService.loadUser(), userService.loadUser());
    }
}
