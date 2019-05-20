package com.willkernel.componentlib;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by willkernel
 * on 2019/5/20.
 */
public interface ILoginService {
    // 从主app跳转loginApp
    void launch(Context context, String targetClass);

    // 主app获取loginApp的返回数据并显示
    Fragment newUserInfoFragment(FragmentManager fragmentManager, int viewId, Bundle bundle);
}
