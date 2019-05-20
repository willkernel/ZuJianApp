package com.willkernel.componentlib;

/**
 * Created by willkernel
 * on 2019/5/20.
 */
public class ServiceFactory {
    private static ServiceFactory instance=new ServiceFactory();
    public static ServiceFactory getInstance(){
        return instance;
    }
    private ServiceFactory() {
    }

    private ILoginService mLoginService;
    private IMineService mineService;

    public ILoginService getmLoginService() {
        return mLoginService;
    }

    public void setmLoginService(ILoginService mLoginService) {
        this.mLoginService = mLoginService;
    }

    public IMineService getMineService() {
        return mineService;
    }

    public void setMineService(IMineService mineService) {
        this.mineService = mineService;
    }
}
