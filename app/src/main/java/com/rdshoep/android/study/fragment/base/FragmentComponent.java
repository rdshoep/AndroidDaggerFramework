package com.rdshoep.android.study.fragment.base;
/*
 * @description
 *   Please write the FragmentComponent module's description
 * @author Zhang (rdshoep@126.com)
 *   http://www.rdshoep.com/
 * @version 
 *   1.0.0(11/5/2015)
 */

import com.rdshoep.android.study.dagger.FragmentLife;
import com.rdshoep.android.study.fragment.FragmentComponentInterface;

import dagger.Component;

@FragmentLife
@Component(modules = FragmentModule.class)
public interface FragmentComponent {
}
