package com.rdshoep.android.study.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.rdshoep.android.study.R;
import com.rdshoep.android.study.activity.base.BaseAppCompatActivity;
import com.rdshoep.android.study.api.UserApi;
import com.rdshoep.android.study.data.service.UserService;
import com.rdshoep.android.study.fragment.DemoFragment;

import javax.inject.Inject;

public class DemoActivity extends BaseAppCompatActivity {

    public static String TAG = "MainActivity";

    @Inject
    UserService userService;
    @Inject
    UserApi userApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getAppComponent().inject(this);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, new DemoFragment(), "fragmentTag")
                .commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, String.valueOf(userService));
        Log.d(TAG, String.valueOf(userApi));
    }
}
