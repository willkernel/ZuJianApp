package com.willkernel.zujianapp;

import android.app.Application;

import com.willkernel.componentlib.AppConfig;
import com.willkernel.componentlib.IAppComponent;

/**
 * Created by willkernel
 * on 2019/5/20.
 */
public class MyApp extends Application implements IAppComponent {
    private static Application instance;

    public Application getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        initial(this);
    }

    @Override
    public void initial(Application application) {
        //将主app的context传递到组件app
        for (String component : AppConfig.COMPONENTS) {
            try {
                Class<?> clz = Class.forName(component);
                Object obj = clz.newInstance();
                if (obj instanceof IAppComponent) {
                    ((IAppComponent) obj).initial(this);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }
}
