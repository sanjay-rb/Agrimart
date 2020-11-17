package com.project.undefine.agrimart;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FlashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);

        //TODO: Move One activity to another activity in 5sec
        movetologin();
    }

    private void movetologin() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent thisactivity = new Intent(FlashActivity.this, LoginActivity.class);
                FlashActivity.this.startActivity(thisactivity);
                FlashActivity.this.finish();
            }
        }, 5000);
    }
}
