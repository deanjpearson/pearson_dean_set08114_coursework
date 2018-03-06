package uk.ac.napier.a40315076.interactivestory;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.animation.Animation;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        ImageView iv = findViewById(R.id.applogo);
        TextView tv1 = findViewById(R.id.splashtv1);
        TextView tv2 = findViewById(R.id.splashtv2);

        Animation splashanim = AnimationUtils.loadAnimation(this,R.anim.splashtransition);
        tv1.startAnimation(splashanim);
        tv2.startAnimation(splashanim);
        iv.startAnimation(splashanim);
        final Intent i = new Intent(this,MenuActivity.class);
        Thread timer=new Thread(){
            public void run(){
                try {
                    sleep(4000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                finally{
                    startActivity(i);
                    finish();
                }
            }
        };

        timer.start();
    }
}
