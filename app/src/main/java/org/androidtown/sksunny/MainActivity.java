package org.androidtown.sksunny;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.InputFilter;
import android.util.SparseIntArray;
import android.view.View;
import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class MainActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener{

   // long now = System.currentTimeMillis();
    //Date date = new Date(now);
    SimpleDateFormat result = new SimpleDateFormat("HH:mm");


    int SleepTime ;
    TextView remainTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimePickerButton timePickerButton = (TimePickerButton) findViewById(R.id.btn_timepicker);
        timePickerButton.setTimeSetListener((TimePickerDialog.OnTimeSetListener) this);

    }

    @Override
    public final void onTimeSet(final TimePicker timePicker, int i, int i1) {
        TimePickerButton timePickerButton = (TimePickerButton) findViewById(R.id.btn_timepicker);
        timePickerButton.setTimeSetListener((TimePickerDialog.OnTimeSetListener) this);
        final TextView remainTime = (TextView)findViewById(R.id.remainTime);

        //text.setText((String)timePickerButton.getText());
        //SleepTime = Integer.parseInt((String) timePickerButton.getText());

        Calendar calendar = Calendar.getInstance();

        SleepTime = (i*60 + i1) - (calendar.get(Calendar.HOUR_OF_DAY)*60 + calendar.get(Calendar.MINUTE));


        int SleepTime_hour = SleepTime/60;
        int SleepTime_min = (SleepTime%60);

        String dateString  = String.valueOf(SleepTime_hour) +":" + String.valueOf(SleepTime_min);
        Date date = null;
        try {
            date = new SimpleDateFormat("HH:mm").parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String newString = new SimpleDateFormat("HH:mm").format(date);


        remainTime.setText(newString);


       // Toast.makeText(getApplicationContext(),newString,Toast.LENGTH_LONG).show();

        //Toast.makeText(getApplicationContext(),String.valueOf(SleepTime_min),Toast.LENGTH_LONG).show();

    }



}
