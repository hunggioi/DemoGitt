package com.example.servicemusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        switch (view.getId()) {
            case R.id.btnPlay:
                startService(new Intent(this, MusicService.class));
                break;
            case R.id.btnStop:
                stopService(new Intent(this, MusicService.class));
                break;
        }
    }


}
