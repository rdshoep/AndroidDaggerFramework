package com.rdshoep.android.study.data.service;
/*
 * @description
 *   Please write the CompanyService module's description
 * @author Zhang (rdshoep@126.com)
 *   http://www.rdshoep.com/
 * @version 
 *   1.0.0(11/5/2015)
 */

import com.rdshoep.android.study.bean.Company;
import com.rdshoep.android.study.bean.User;

import java.util.List;

public interface CompanyService {

    Company getCompany();

    List<User> getMembers();
}
