package com.dm.wallpaper.board.sample.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.dm.wallpaper.board.activities.WallpaperBoardSplashActivity;

public class SplashActivity extends WallpaperBoardSplashActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        initSplashActivity(savedInstanceState, MainActivity.class);
    }
}
