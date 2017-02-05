package com.dm.wallpaper.board.sample.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.dm.wallpaper.board.activities.WallpaperBoardSplashActivity;
import com.dm.wallpaper.board.sample.R;

public class SplashActivity extends WallpaperBoardSplashActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        int duration = getResources().getInteger(R.integer.splash_screen_duration);
        initSplashActivity(savedInstanceState, MainActivity.class, duration);
    }
}
