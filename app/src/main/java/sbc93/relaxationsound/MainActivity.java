package sbc93.relaxationsound;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends GlobalActivity {

    FloatingActionButton fab;
    ScrollView sv1;
    Button b1, b2, b3, b4, b5;
    Boolean s1, s2, s3, s4, s5;
    Boolean scV;
    SeekBar sb, sb2, sb3, sb4, sb5;
    MediaPlayer player1, player2, player3, player4, player5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initVar();
        buttonAction();
        seekBar();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            Toast.makeText(getApplicationContext(), "portrait", Toast.LENGTH_SHORT).show();
            Log.d("flow", "config change 1");
        }
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(getApplicationContext(), "landscape", Toast.LENGTH_SHORT).show();
            Log.d("flow", "config change 2");
        }
    }

    void buttonAction() {

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!s1) {
                    s1 = true;
                    player1 = MediaPlayer.create(getApplicationContext(), R.raw.music1);
                    b1.setBackgroundColor(getResources().getColor(R.color.on));
                    sb.setVisibility(View.VISIBLE);
                    sb.setProgress(100);
                    startMediaPlayer(player1);
                } else {
                    s1 = false;
                    sb.setVisibility(View.GONE);
                    b1.setBackgroundColor(getResources().getColor(R.color.off));
                    stopPlayer(player1);

                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!s2) {
                    s2 = true;
                    player2 = MediaPlayer.create(getApplicationContext(), R.raw.music2);
                    b2.setBackgroundColor(getResources().getColor(R.color.on));
                    sb2.setVisibility(View.VISIBLE);
                    sb2.setProgress(100);
                    startMediaPlayer(player2);
                } else {
                    s2 = false;
                    sb2.setVisibility(View.GONE);
                    b2.setBackgroundColor(getResources().getColor(R.color.off));
                    stopPlayer(player2);
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!s3) {
                    s3 = true;
                    player3 = MediaPlayer.create(getApplicationContext(), R.raw.music3);
                    b3.setBackgroundColor(getResources().getColor(R.color.on));
                    sb3.setVisibility(View.VISIBLE);
                    sb3.setProgress(100);
                    startMediaPlayer(player3);
                } else {
                    s3 = false;
                    sb3.setVisibility(View.GONE);
                    b3.setBackgroundColor(getResources().getColor(R.color.off));
                    stopPlayer(player3);
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!s4) {
                    s4 = true;
                    player4 = MediaPlayer.create(getApplicationContext(), R.raw.music3);
                    b4.setBackgroundColor(getResources().getColor(R.color.on));
                    sb4.setVisibility(View.VISIBLE);
                    sb4.setProgress(100);
                    startMediaPlayer(player4);
                } else {
                    s4 = false;
                    sb4.setVisibility(View.GONE);
                    b4.setBackgroundColor(getResources().getColor(R.color.off));
                    stopPlayer(player4);
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!s5) {
                    s5 = true;
                    player5 = MediaPlayer.create(getApplicationContext(), R.raw.music3);
                    b5.setBackgroundColor(getResources().getColor(R.color.on));
                    sb5.setVisibility(View.VISIBLE);
                    sb5.setProgress(100);
                    startMediaPlayer(player5);
                } else {
                    s5 = false;
                    sb5.setVisibility(View.GONE);
                    b5.setBackgroundColor(getResources().getColor(R.color.off));
                    stopPlayer(player5);
                }
            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(scV) {
                    scV = false;
                    sv1.setVisibility(View.INVISIBLE);
                    fab.setImageResource(R.drawable.ic_play);
                } else {
                    scV = true;
                    sv1.setVisibility(View.VISIBLE);
                    fab.setImageResource(R.drawable.ic_down);
                }
            }
        });
    }

    void seekBar() {
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float volume = setVolume(progress);
                player1.setVolume(volume, volume);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        sb2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float volume = setVolume(progress);
                player2.setVolume(volume, volume);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        sb3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float volume = setVolume(progress);
                player3.setVolume(volume, volume);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        sb4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float volume = setVolume(progress);
                player4.setVolume(volume, volume);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        sb5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float volume = setVolume(progress);
                player5.setVolume(volume, volume);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    void initVar() {

        sv1 = findViewById(R.id.sv_1);
        fab = findViewById(R.id.fab);

        b1 = findViewById(R.id.btn_1);
        b2 = findViewById(R.id.btn_2);
        b3 = findViewById(R.id.btn_3);
        b4 = findViewById(R.id.btn_4);
        b5 = findViewById(R.id.btn_5);

        sb = findViewById(R.id.seekbar_1);
        sb2 = findViewById(R.id.seekbar_2);
        sb3 = findViewById(R.id.seekbar_3);
        sb4 = findViewById(R.id.seekbar_4);
        sb5 = findViewById(R.id.seekbar_5);

        s1 = false;
        s2 = false;
        s3 = false;
        s4 = false;
        s5 = false;

        scV = true;

    }

}
