package com.example.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private TimerTask timerTask;
    TextView view;
   Handler mHandler = new Handler();
int c=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view=findViewById(R.id.text1);
        Person ref=new Person();
        ref.setAnswer("cc");
        ref.setUser_id("hhh");
        ref.setCompany_id("g");
        ref.setCompany_id("yfy");
        ref.setSurvey_id("hgg");
        ref.setQuestion("hj");
        ref.options1="hvh";
                ref.options2="hvh";
                        ref.options3="hvh";
                                ref.options4="hvh";
                                        ref.answer_type="hvh";
       
            //set a new Timer
            Timer timer = new Timer();

            //initialize the TimerTask's job
            initializeTimerTask();

            //schedule the timer, after the first 5000ms the TimerTask will run every 10000ms
            timer.schedule(timerTask, 0, 10000); //
        
Roomdatabase.get(this).Data().insert(ref);
    }

    private void initializeTimerTask() {
        timerTask = new TimerTask() {
            public void run() {

                mHandler.post(new Runnable() {
                    @Override
                    public void run () {
                        view.setText(c+"");
                        if(c==4){
                            timerTask.cancel();
                            c=0;
                        }
                        c++;
                    }
                });



            }
        };
    }
}