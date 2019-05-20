package com.willkernel.componentlib;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by willkernel
 * on 2019/5/20.
 */
public interface IMineService {
    // 从主app跳转loginApp
    void launch(Context context, String userId);

}
