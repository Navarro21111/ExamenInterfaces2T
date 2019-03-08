package com.example.manpa.noplanetb;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.mikhaellopez.circularimageview.CircularImageView;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        TextView myTitle = (TextView)findViewById(R.id.tvArriba);
        TextView mySubtitle = (TextView)findViewById(R.id.tvAbajo);
        ImageView myImage = (ImageView)findViewById(R.id.imageView);

        ImageView mPlanet = (ImageView) findViewById(R.id.backforest);


        Glide.with(this)
                .load(R.drawable.planet_earth)
                .apply(new RequestOptions()
                        .centerCrop()
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                )
                .into(mPlanet);

        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.splash_animation);

        myImage.startAnimation(myanim);
        openApp(true);
    }

    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen
                        .this, Main2Activity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}
