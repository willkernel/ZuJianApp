package com.willkernel.minecomponent;

import android.app.Application;

import com.willkernel.componentlib.IAppComponent;
import com.willkernel.componentlib.ServiceFactory;

/**
 * Created by willkernel
 * on 2019/5/20.
 */
public class MineApp extends Application implements IAppComponent {
    private static Application instance;

    public Application getInstance() {
        return instance;
    }

    //app时单独调用
    @Override
    public void onCreate() {
        super.onCreate();
        initial(this);
    }

    //library 时调用
    @Override
    public void initial(Application application) {
        instance = application;
        ServiceFactory.getInstance().setMineService(new MineService());
    }
}
