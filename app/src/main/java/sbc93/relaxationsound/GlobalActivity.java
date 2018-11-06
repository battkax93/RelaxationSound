package sbc93.relaxationsound;

import android.app.Activity;
import android.app.Dialog;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.animation.TranslateAnimation;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

/**
 * Created by BLACK on 04/11/2018.
 */

public class GlobalActivity extends AppCompatActivity {

    void startMediaPlayer(MediaPlayer player) {
        Log.d("flow", "create media");
        player.setLooping(false); // Set looping
        player.start();

    }

    void stopPlayer(MediaPlayer player) {
        Log.d("flow", "stop player");
        player.stop();
        player.release();
        player = null;
    }

    float setVolume(int progress) {
        float volume = (float) (1 - (Math.log(100 - progress) / Math.log(100)));
        return volume;
    }

    public void slideUp(View view) {
        view.setVisibility(View.VISIBLE);
        TranslateAnimation animate = new TranslateAnimation(
                0,                 // fromXDelta
                0,                 // toXDelta
                view.getHeight() * 2,  // fromYDelta
                0);                // toYDelta
        animate.setDuration(1000);
        animate.setFillAfter(true);
        view.startAnimation(animate);
    }

    public void slideDown(View view) {
        TranslateAnimation animate = new TranslateAnimation(
                0,                 // fromXDelta
                0,                  // toXDelta
                0,                 // fromYDelta
                view.getHeight() * 2); // toYDelta
        animate.setDuration(1000);
        animate.setFillAfter(true);
        view.startAnimation(animate);
    }

    void animateButton(View v) {
        YoYo.with(Techniques.RotateIn)
                .duration(1000)
                .playOn(v);
    }
}
