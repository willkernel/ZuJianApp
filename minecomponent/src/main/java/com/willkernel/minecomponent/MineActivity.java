package com.willkernel.minecomponent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MineActivity extends AppCompatActivity {

    public static final String EXTRA_USER_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine);
    }
}
