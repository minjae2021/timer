package com.example.timer;

import android.graphics.Color;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView clock;
    Chronometer chronometer;
    Button start, stop;

    Calendar now = Calendar.getInstance();
    int year = now.get(Calendar.YEAR);
    int month = now.get(Calendar.MONTH) + 1;
    int date = now.get(Calendar.DATE);
    int hour = now.get(Calendar.HOUR);
    int min = now.get(Calendar.MINUTE);
    int sec = now.get(Calendar.SECOND);


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clock = (TextView) findViewById(R.id.clock);

        clock.setText(" " + year + "." + month + "." + date + " ");

        start = (Button) findViewById(R.id.start);
        stop = (Button) findViewById(R.id.stop);

    }
}