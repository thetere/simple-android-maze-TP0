package ar.edu.ips.aus.seminario2.sampleproject;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class MazeSplashActivity extends AppCompatActivity {

    Handler mHandler;
    Runnable mRunnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        mHandler = new Handler();
        mRunnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MazeSplashActivity.this,MazeBoardActivity.class);
                startActivity(intent);
                finish();
            }
        };

        // its trigger runnable after 4000 millisecond.
        mHandler.postDelayed(mRunnable,4000);

    }

}
