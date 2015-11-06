package com.rdshoep.android.study.api;
/*
 * @description
 *   Please write the RequestCallback module's description
 * @author Zhang (rdshoep@126.com)
 *   http://www.rdshoep.com/
 * @version 
 *   1.0.0(11/6/2015)
 */

import java.util.List;

public interface RequestCallback<T> {
    void onSuccess(List<T> objList);

    void onFailure(String errorMsg);
}
