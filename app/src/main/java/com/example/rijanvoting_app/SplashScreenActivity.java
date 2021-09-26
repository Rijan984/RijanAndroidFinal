package com.example.rijanvoting_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.shivrajvoting.R;

public class SplashScreenActivity extends AppCompatActivity {

    private  int SLEEP_TIMER = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        LogoLuncher logoLuncher = new LogoLuncher();
        logoLuncher.start();


    }
    private  class LogoLuncher extends Thread{
        public  void  run(){
            try{
                sleep(2000 * SLEEP_TIMER);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
            SplashScreenActivity.this.fileList();
        }
    }
}
