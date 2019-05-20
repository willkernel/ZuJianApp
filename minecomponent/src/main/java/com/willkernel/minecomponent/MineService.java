package com.willkernel.minecomponent;

import android.content.Context;
import android.content.Intent;

import com.willkernel.componentlib.IMineService;

/**
 * Created by willkernel
 * on 2019/5/20.
 */
public class MineService implements IMineService {
    @Override
    public void launch(Context context, String userId) {
        Intent intent = new Intent(context, MineActivity.class);
        intent.putExtra(MineActivity.EXTRA_USER_ID, userId);
        context.startActivity(intent);
    }
}
