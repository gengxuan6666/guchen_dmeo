package com.example.day_16;

import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
     ImageView dishu_1,dishu_2,dishu_3,dishu_4,dishu_5,dishu_6;
    private Button bt_kp;
    private SoundPool soundPool;//音乐池
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dishu_1 = findViewById(R.id.dishu_1);
        dishu_2 = findViewById(R.id.dishu_2);
        dishu_3 = findViewById(R.id.dishu_3);
        dishu_4 = findViewById(R.id.dishu_4);
        dishu_5 = findViewById(R.id.dishu_5);
        dishu_6 = findViewById(R.id.dishu_6);
        dishu_1.setOnClickListener(this);
        dishu_2.setOnClickListener(this);
        dishu_3.setOnClickListener(this);
        dishu_4.setOnClickListener(this);
        dishu_5.setOnClickListener(this);
        dishu_6.setOnClickListener(this);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                   final int count = (int)(Math.random()*6);
                   runOnUiThread(new Runnable() {
                       @Override
                       public void run() {
                           switch (count){

                               case 0:
                                   dishu_1.setVisibility(View.VISIBLE);
                                   dishu_2.setVisibility(View.GONE);
                                   dishu_3.setVisibility(View.GONE);
                                   dishu_4.setVisibility(View.GONE);
                                   dishu_5.setVisibility(View.GONE);
                                   dishu_6.setVisibility(View.GONE);
                                   break;
                               case 1:
                                   dishu_1.setVisibility(View.GONE);
                                   dishu_2.setVisibility(View.VISIBLE);
                                   dishu_3.setVisibility(View.GONE);
                                   dishu_4.setVisibility(View.GONE);
                                   dishu_5.setVisibility(View.GONE);
                                   dishu_6.setVisibility(View.GONE);
                                   break;
                               case 2:
                                   dishu_1.setVisibility(View.GONE);
                                   dishu_2.setVisibility(View.GONE);
                                   dishu_3.setVisibility(View.VISIBLE);
                                   dishu_4.setVisibility(View.GONE);
                                   dishu_5.setVisibility(View.GONE);
                                   dishu_6.setVisibility(View.GONE);
                                   break;
                               case 3:
                                   dishu_1.setVisibility(View.GONE);
                                   dishu_2.setVisibility(View.GONE);
                                   dishu_3.setVisibility(View.GONE);
                                   dishu_4.setVisibility(View.VISIBLE);
                                   dishu_5.setVisibility(View.GONE);
                                   dishu_6.setVisibility(View.GONE);
                                   break;
                               case 4:
                                   dishu_1.setVisibility(View.GONE);
                                   dishu_2.setVisibility(View.GONE);
                                   dishu_3.setVisibility(View.GONE);
                                   dishu_4.setVisibility(View.GONE);
                                   dishu_5.setVisibility(View.VISIBLE);
                                   dishu_6.setVisibility(View.GONE);
                                   break;
                               case 5:
                                   dishu_1.setVisibility(View.GONE);
                                   dishu_2.setVisibility(View.GONE);
                                   dishu_3.setVisibility(View.GONE);
                                   dishu_4.setVisibility(View.GONE);
                                   dishu_5.setVisibility(View.GONE);
                                   dishu_6.setVisibility(View.VISIBLE);
                                   break;

                           }
                       }
                   });

                    try {
                        Thread.sleep(1000);
                        dishu_1.setImageResource(R.mipmap.dishu);
                        dishu_2.setImageResource(R.mipmap.dishu);
                        dishu_3.setImageResource(R.mipmap.dishu);
                        dishu_4.setImageResource(R.mipmap.dishu);
                        dishu_5.setImageResource(R.mipmap.dishu);
                        dishu_6.setImageResource(R.mipmap.dishu);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                }
            }
        }).start();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.dishu_1:
                dishu_1.setImageResource(R.mipmap.guadiao);
                dishu_2.setImageResource(R.mipmap.dishu);
                dishu_3.setImageResource(R.mipmap.dishu);
                dishu_4.setImageResource(R.mipmap.dishu);
                dishu_5.setImageResource(R.mipmap.dishu);
                dishu_6.setImageResource(R.mipmap.dishu);
                break;
            case R.id.dishu_2:
                dishu_1.setImageResource(R.mipmap.dishu);
                dishu_2.setImageResource(R.mipmap.guadiao);
                dishu_3.setImageResource(R.mipmap.dishu);
                dishu_4.setImageResource(R.mipmap.dishu);
                dishu_5.setImageResource(R.mipmap.dishu);
                dishu_6.setImageResource(R.mipmap.dishu);
                break;
            case R.id.dishu_3:
                dishu_1.setImageResource(R.mipmap.dishu);
                dishu_2.setImageResource(R.mipmap.dishu);
                dishu_3.setImageResource(R.mipmap.guadiao);
                dishu_4.setImageResource(R.mipmap.dishu);
                dishu_5.setImageResource(R.mipmap.dishu);
                dishu_6.setImageResource(R.mipmap.dishu);
                break;
            case R.id.dishu_4:
                dishu_1.setImageResource(R.mipmap.dishu);
                dishu_2.setImageResource(R.mipmap.dishu);
                dishu_3.setImageResource(R.mipmap.dishu);
                dishu_4.setImageResource(R.mipmap.guadiao);
                dishu_5.setImageResource(R.mipmap.dishu);
                dishu_6.setImageResource(R.mipmap.dishu);
                 break;
            case R.id.dishu_5:
                dishu_1.setImageResource(R.mipmap.dishu);
                dishu_2.setImageResource(R.mipmap.dishu);
                dishu_3.setImageResource(R.mipmap.dishu);
                dishu_4.setImageResource(R.mipmap.dishu);
                dishu_5.setImageResource(R.mipmap.guadiao);
                dishu_6.setImageResource(R.mipmap.dishu);
                break;
            case R.id.dishu_6:
                dishu_1.setImageResource(R.mipmap.dishu);
                dishu_2.setImageResource(R.mipmap.dishu);
                dishu_3.setImageResource(R.mipmap.dishu);
                dishu_4.setImageResource(R.mipmap.dishu);
                dishu_5.setImageResource(R.mipmap.dishu);
                dishu_6.setImageResource(R.mipmap.guadiao);
                break;

        }

    }
}
