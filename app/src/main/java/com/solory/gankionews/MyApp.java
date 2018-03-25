package com.solory.gankionews;
/*
 *
 * Created by 黄伟杰 on 2018/3/10.
 */

import android.app.Application;

import com.solory.gankionews.fragment.MyFragment;

import java.util.ArrayList;
import java.util.List;


public class MyApp extends Application {
    private static MyApp instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance=this;

    }

    public static MyApp getInstance() {
        return instance;
    }


}
