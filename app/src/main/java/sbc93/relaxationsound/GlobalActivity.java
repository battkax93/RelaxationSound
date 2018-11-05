package sbc93.relaxationsound;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

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

    float setVolume( int progress) {
        float volume = (float) (1 - (Math.log(100 - progress) / Math.log(100)));
        return volume;
    }

    public int getOrientation(){
        return  getResources().getConfiguration().orientation;
    }


}
