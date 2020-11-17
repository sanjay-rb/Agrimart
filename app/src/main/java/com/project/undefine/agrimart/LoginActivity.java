package com.project.undefine.agrimart;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //TODO: hide action bar
        Objects.requireNonNull(getSupportActionBar()).hide();

        //TODO: Play Bg Video
        playbgvideo();

        //TODO: Make login

    }

    private void playbgvideo() {
        VideoView mvideoview = findViewById(R.id.loginbg);
        Uri uri = Uri.parse("android.resource://com.project.undefine.agrimart/"+R.raw.loginbg);
        mvideoview.setVideoURI(uri);
        mvideoview.start();

        mvideoview.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });
    }
}
